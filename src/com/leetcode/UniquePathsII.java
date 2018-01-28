package com.leetcode;

/**
 * Created by jamylu on 2018/1/28.
 * leetcode063.
 * 矩阵中存在障碍
 */
public class UniquePathsII {
    public static void main(String[] args) {
        int obstacleGrid[][] = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length; // rows
        int n = obstacleGrid[0].length; // cols
        int i, j;
        int dp[][] = new int[m][n];

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    if (i == 0 && j == 0) {
                        dp[i][j] = 1;
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j - 1];
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    }
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
