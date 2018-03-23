package com.pku;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/19.
 * 进制转换，给定的n是大数
 */
public class RadixChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            outputBigInteger(s);
            output(s);
        }
        scanner.close();
    }


    // 使用BigInteger类

    public static void outputBigInteger(String s) {
        BigInteger bigInteger = new BigInteger(s);
        System.out.println(bigInteger.toString(2));
    }


    // 测试进制转换
    public static void testRadix() {
        String s = "11";
        BigInteger bigInteger = new BigInteger(s, 8);
        System.out.println(bigInteger.toString(10));
    }

    public static void output(String s) {
        int len = s.length();
        int input[] = new int[len];
        int output[] = new int[500]; // 需要输出的二进制
        for (int i = 0; i < len; i++) {
            input[i] = s.charAt(i) - '0';
        }

        int k = 0, sum = 1, d;
        while (sum > 0) {
            sum = 0;
            for (int i = 0; i < len; i++) {
                d = input[i] / 2;
                sum += d;
                if (i == len - 1)
                    output[k++] = input[i] % 2;
                else
                    input[i + 1] += (input[i] % 2) * 10;
                input[i] = d;
            }
        }
        // 输出二进制
        if (k == 0) {
            System.out.print(0);
        } else {
            for (int i = k - 1; i >= 0; i--) {
                System.out.print(output[i]);
            }
        }
        System.out.println();
    }
}
