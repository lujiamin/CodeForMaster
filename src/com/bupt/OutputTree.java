package com.bupt;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/28.
 */
public class OutputTree {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int d = scanner.nextInt();
            if ((int) Math.pow(2, d - 1) > n) {
                System.out.println("EMPTY");
            } else {
                for (int i = (int) Math.pow(2, d - 1) - 1; i <= (int) Math.pow(2, d) - 2; i++) {
                    if (i < n) {
                        if (i == Math.pow(2, d) - 2 || i == n - 1) {
                            System.out.println(a[i]);
                        } else {
                            System.out.print(a[i] + " ");
                        }
                    }
                }
            }
        }

    }
}
