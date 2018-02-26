package com.wangdao.search.Recursion;

/**
 * Created by jamylu on 2018/2/26.
 * 递归实现汉诺塔问题
 */
public class Hanoi {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        int n = 3;
        hanoi(n, a, b, c);
    }

    public static void move(int x, char from, char to) {
        System.out.println(x + " move from " + from + " to " + to);
    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            move(1, a, c);
        } else {
            hanoi(n - 1, a, c, b); // a上的n-1个移至b,c做辅助
            move(n, a, c);
            hanoi(n - 1, b, a, c);
        }
    }
}
