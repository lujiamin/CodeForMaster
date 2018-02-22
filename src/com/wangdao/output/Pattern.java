package com.wangdao.output;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/2/22.
 */
public class Pattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            char c1 = scanner.next().charAt(0);
            char c2 = scanner.next().charAt(0);
            char[][] arr = new char[n + 1][n + 1];
            for (int i = 1, j = 1; i <= n; i += 2, j++) {
                int x = n / 2 + 1, y = x;
                x -= j - 1;
                y -= j - 1;
                char c = j % 2 == 1 ? c1 : c2;
                for (int k = 1; k <= i; k++) {
                    arr[x + k - 1][y] = c;
                    arr[x][y + k - 1] = c;
                    arr[x + i - 1][y + k - 1] = c;
                    arr[x + k - 1][y + i - 1] = c;
                }
            }
            if (n != 1) {
                arr[1][1] = ' ';
                arr[n][1] = ' ';
                arr[1][n] = ' ';
                arr[n][n] = ' ';
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        }
        scanner.close();

    }
}
