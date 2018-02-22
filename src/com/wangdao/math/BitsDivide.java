package com.wangdao.math;

import java.util.Scanner;

/*
 * 实现下述规则的算法：123*45 = 1*4+1*5+2*4+2*5+3*4+3*5
 */
public class BitsDivide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int arr1[] = new int[20];
        int arr2[] = new int[20];
        int i = 0;
        int j = 0;
        int ans = 0;
        while (a > 0) {
            arr1[i++] = a % 10;
            a /= 10;
        }
        while (b > 0) {
            arr2[j++] = b % 10;
            b /= 10;
        }
        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {
                ans += arr1[m] * arr2[n];
            }
        }
        System.out.println(ans);
        scanner.close();

    }
    // 另外可以使用字符串存储输入的整数，利用ASCII码和数值差值进行计算

}
