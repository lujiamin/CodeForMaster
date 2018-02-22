package com.wangdao.output;

import java.util.Scanner;

/*
 * 输入一个高度 h，输出一个高为 h，上底边为 h 的直角梯形
 */
public class Trapezoid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h + 2 * (h - 1); j++) {
                if (j < 2 * h - 2 * i - 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
