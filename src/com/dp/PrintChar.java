package com.dp;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/25.
 * 打印 n 个相同的字符，插入或删除一个字符花费的时间为 x，复制当前整个文本并且粘贴在后面的时间花费为 y，求完成 n 个字符的打印所需的最小花费时间。
 */
public class PrintChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(print(n, x, y));
        scanner.close();
    }

    public static long print(int n, int x, int y) {
        if (n == 0) return 0;
        if (n == 1) return x;
        long dp[] = new long[n + 1];
//        int tmp;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
//                tmp = Math.min(dp[i / 2], dp[(i + 1) / 2]);
                dp[i] = Math.min(dp[(i + 1) / 2] + y + x, dp[i - 1] + x);

            } else {
                dp[i] = Math.min(dp[i / 2] + y, dp[i - 1] + x);
            }
        }

        return dp[n];
    }
}
