package com.leetcode;

/**
 * Created by jamylu on 2018/1/28.
 * leetcode062.
 * 只能向下或向右走，到达右下角的路径数
 */
public class UniquePaths {
    // 动态规划解决
    public int paths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
