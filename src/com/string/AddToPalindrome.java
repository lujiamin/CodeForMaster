package com.string;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/21.
 * 判断字符串添加一个字符能否编程回文串
 */
public class AddToPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            String stringReverse = new StringBuilder(string).reverse().toString(); // 将字符串转置
            int commonLen = commonSeq(string, stringReverse);
            if (commonLen >= string.length() - 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    // 求公共子序列
    public static int commonSeq(String a, String b) {
        int dp[][] = new int[a.length() + 1][b.length() + 1];
        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {

                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[a.length()][b.length()];
    }
}

