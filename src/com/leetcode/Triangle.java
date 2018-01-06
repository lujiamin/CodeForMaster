package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jamylu on 2018/1/6.
 * leetcode120.
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 */
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));
        list.add(Arrays.asList(5, 9, 6, 1, 3));
        System.out.println(minimumTotal(list));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int dp[][] = new int[n + 1][n + 2];
        //动态规划初始化
        dp[1][1] = triangle.get(0).get(0);
        for (int i = 0; i <= n; i++) {
            dp[i][0] = Integer.MAX_VALUE;
            dp[i][i + 1] = Integer.MAX_VALUE;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                //dp[i][j]只能由上一行的dp[i-1][j-1]和dp[i-1][j]得到
                dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i - 1).get(j - 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int j = 1; j <= n; j++) {
            if (dp[n][j] < min) {
                min = dp[n][j];
            }
        }
        return min;
    }
}
