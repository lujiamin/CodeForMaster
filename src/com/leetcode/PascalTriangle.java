package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jamylu on 2018/1/6.
 * leetcode118.
 * 以list的形式返回杨辉三角(帕斯卡).
 */
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }

    //动态规划
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        int dp[][] = new int[numRows + 1][numRows + 1];
        //赋初值，其余为0
        dp[0][1] = 1;
        for (int i = 1; i <= numRows; i++) {
            // 每次都是重新申请变量
            List<Integer> elem = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                elem.add(dp[i][j]);
            }
//            System.out.println(elem);
            list.add(elem);
        }
        return list;
    }
}
