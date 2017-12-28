package com.bupt;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/28.
 */
public class MatrixPow {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int size = scanner.nextInt();
            while (size > 0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int arr[][] = new int[n][n];
                int answer[][] = new int[n][n];
                //输入矩阵
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        arr[i][j] = scanner.nextInt();
                        answer[i][j] = arr[i][j];
                    }
                }
                for (int i = 1; i < k; i++) {
                    answer = matrixMultiply(answer, arr, n);
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j == n - 1) {
                            System.out.print(answer[i][j]);
                        } else {
                            System.out.print(answer[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

                size--;
            }
        }
    }

    public static int[][] matrixMultiply(int a[][], int b[][], int n) {
        int c[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
