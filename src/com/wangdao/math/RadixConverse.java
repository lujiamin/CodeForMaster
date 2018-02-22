package com.wangdao.math;

import java.util.Scanner;

public class RadixConverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();// 要转换成的进制
        int n = scanner.nextInt();// 待转换的十进制数
        converse(base, n);
        scanner.close();
    }

    // 余数倒序输出，递归实现
    private static void converse(int base, int n) {
        if (n > 0) {
            converse(base, n / base);
            System.out.print(n % base);
        }
    }

}
