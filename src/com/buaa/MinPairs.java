package com.buaa;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/14.
 * 找最小的整数对，x，y都尽可能小
 */
public class MinPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int x, y;
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                x = scanner.nextInt();
                y = scanner.nextInt();
                if (x < minX) {
                    minX = x;
                    minY = y;
                } else if (x == minX && y < minY) {
                    minY = y;
                }
            }
            System.out.println(minX + " " + minY);
        }
        scanner.close();
    }
}
