package com.buaa;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/14.
 * 判断矩阵是否由另一矩阵旋转而来，这里要切记矩阵旋转的横纵坐标的关系
 */
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 矩阵阶数
            int n = scanner.nextInt();
            int matrix1[][] = new int[n][n];
            int matrix2[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            if (isRotate0(n, matrix1, matrix2) == 0) {
                System.out.println(0);
                break;
            } else if (isRotate90(n, matrix1, matrix2) == 90) {
                System.out.println(90);
                break;
            } else if (isRotate180(n, matrix1, matrix2) == 180) {
                System.out.println(180);
                break;
            } else if (isRotate270(n, matrix1, matrix2) == 270) {
                System.out.println(270);
                break;
            } else {
                System.out.println(-1);
            }
        }
        scanner.close();
    }

    public static int isRotate0(int n, int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static int isRotate90(int n, int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix1[i][j] != matrix2[j][n - i - 1]) {
                    return -1;
                }
            }
        }
        return 90;
    }

    public static int isRotate180(int n, int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix1[i][j] != matrix2[n - i - 1][n - j - 1]) {
                    return -1;
                }
            }
        }
        return 180;
    }

    public static int isRotate270(int n, int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix1[i][j] != matrix2[n - j - 1][i]) {
                    return -1;
                }
            }
        }
        return 270;
    }
}
