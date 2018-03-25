package com.bit;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/25.
 * [a,b]之间二进制1的个数最多的数
 */
public class MostBitsOfOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long tx = 1; // 64bit 1
            while (true) {
                if ((a | tx) <= b) {
                    a |= tx;
                    tx = tx << 1;
                } else
                    break;
            }
            System.out.println("Case " + i + ": " + a);
        }

        sc.close();

    }
}
