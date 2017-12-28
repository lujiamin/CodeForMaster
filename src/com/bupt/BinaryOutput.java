package com.bupt;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/27.
 */
public class BinaryOutput {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.toBinaryString(scanner.nextInt());//输出整数的二进制形式
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
