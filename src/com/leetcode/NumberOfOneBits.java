package com.leetcode;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/25.
 * leetcode191
 * 二进制1的位数
 */
public class NumberOfOneBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(hammingWeight(n));
        }

        scanner.close();
    }

    public static int hammingWeight(int n) {

        int ans = 0; // 位数
        int tmp = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & tmp) == 0) {

            } else {
                ans++;
            }
            tmp <<= 1;
        }
        return ans;
    }
}
