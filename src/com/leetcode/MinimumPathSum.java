package com.leetcode;

/**
 * Created by jamylu on 2018/1/19.
 * leetcode
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {5, 6}, {1, 1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int n = grid.length; // rows
        int m = grid[0].length; // cols
        int[][] dp = new int[n][m];
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else if (i == 0 && j != 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j == 0 && i != 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
