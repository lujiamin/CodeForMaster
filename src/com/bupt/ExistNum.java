package com.bupt;

import java.util.Scanner;

/**
 * Created by jamylu on 2017/12/29.
 * n个数中是否存在m
 */
public class ExistNum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int arr[] = new int[101];
            //空间换时间
            for (int i = 0; i < n; i++) {
                arr[scanner.nextInt()]++;
            }
            int m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                if (arr[scanner.nextInt()] > 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
