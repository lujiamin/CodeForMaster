package com.bupt;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/6.
 * 旋转一个5维数组，(x,y)表示以arr[x-1][y-1]为左上角的矩阵
 */
public class CReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int arr[][] = new int[5][5];
            int arrB[][] = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j] = scanner.nextInt();
                    arrB[i][j] = arr[i][j];
                }
            }
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int x = scanner.nextInt();
            int y = scanner.nextInt();


            // a == 1 代表顺时针，b == 2 代表翻转4个数
            if (a == 1) {
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < b; j++) {
                        // 原纵坐标j变为横坐标j，原横坐标i变为b-1-i。但是元素以(x-1,y-1)为开始
                        arrB[j + x - 1][b - 1 - i + y - 1] = arr[x - 1 + i][y - 1 + j];
                    }
                }
            }
            // a == 2 代表逆时针，b == 2 代表翻转4个数
            if (a == 2) {
                for (int i = 0; i < b; i++) {
                    for (int j = 0; j < b; j++) {
                        arrB[b - 1 - j + x - 1][i + y - 1] = arr[x - 1 + i][y - 1 + j];
                    }
                }

            }
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (j == 4) {
                        System.out.print(arrB[i][j]);
                    } else {
                        System.out.print(arrB[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
