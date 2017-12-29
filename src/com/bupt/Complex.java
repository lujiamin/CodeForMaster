package com.bupt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/28.
 * 找出模最大的负数a+ib，相同时以b小的为序
 */
public class Complex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());//回车会被当成字符串输入
            HashSet<Num> set = new HashSet<>();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = scanner.nextLine();
            }
            for (int i = 0; i < n; i++) {

                if (str[i].equals("Pop")) {
                    if (set.size() == 0) {
                        System.out.println("empty");
                    } else {
                        System.out.println(findMax(set).real + "+i" + findMax(set).imag);
                        set.remove(findMax(set));
                        System.out.println("SIZE = " + set.size());
                    }

                } else {
                    Num tmp = new Num();
                    tmp.real = Integer.parseInt(str[i].substring(7, str[i].indexOf('+')));
                    tmp.imag = Integer.parseInt(str[i].substring(str[i].indexOf('i') + 1));
                    set.add(tmp);
                    System.out.println("SIZE = " + set.size());
                }
            }
        }

    }

    //按题意去a,b中模值大的
    public static Num compare(Num a, Num b) {
        if (a.real * a.real + a.imag * a.imag > b.real * b.real + b.imag * b.imag
                || (a.real * a.real + a.imag * a.imag == b.real * b.real + b.imag * b.imag && b.imag > a.imag)) {
            return a;
        } else {
            return b;
        }
    }

    //找list中最大的
    public static Num findMax(HashSet<Num> set) {
        Iterator<Num> it = set.iterator();
        Num max = it.next();
        while (it.hasNext()) {
            max = compare(max, it.next());
        }
        return max;
    }
}

class Num {
    public int real;
    public int imag;

    public Num() {

    }
}