package com.wangdao.dp;

/**
 * Created by jamylu on 2018/2/26.
 * 两个字符串的公共子序列
 */
public class LongestCommonSubSeq {
    public static void main(String[] args) {
        String a = "abcbd";
        String b = "acxbydz";
        System.out.println(commonSub(a, b));
    }

    public static int commonSub(String a, String b) {
        int dp[][] = new int[100][100];
        int i, j;
        for (i = 0; i <= a.length(); i++) {
            dp[i][0] = 0;
        }
        for (j = 0; j <= b.length(); j++) {
            dp[0][j] = 0;
        }
        // 对于字符串的下标从1~s.length
        for (i = 1; i <= a.length(); i++) {
            for (j = 1; j <= b.length(); j++) {
                // a[i] == b[j]的情况
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {// 不等的情况
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[a.length()][b.length()];

    }
}
