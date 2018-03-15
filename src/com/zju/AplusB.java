package com.zju;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/15.
 * 实现A加B
 */
public class AplusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int k = scanner.nextInt();// a和b的末尾k位是否相同

            if (a == 0 && b == 0) {
                break;
            }
            // 不相同输出a+b
            int tmpA = a;
            int tmpB = b;
            while (k > 0) {
                if (tmpA % 10 != tmpB % 10) {
                    System.out.println(a + b);
                    break;
                }
                tmpA /= 10;
                tmpB /= 10;
                k--;
            }
            // 相同输出-1
            if (k == 0) {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}
