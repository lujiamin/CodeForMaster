package com.wangdao.dp;

/**
 * Created by jamylu on 2018/2/26.
 * 求最长不增序列的元素个数
 */
public class LongestSubSeq {
    public static void main(String[] args) {
        int[] arr = {300, 207, 155, 300, 299, 170, 158, 65};
        int dp[] = new int[arr.length];
        dp[0] = 1;
        int i, j;
        // ans[i] 存放以arr[i]为结尾的最长子序列
        for (i = 1; i < arr.length; i++) {
            // i之前的元素
            for (j = 0; j < i; j++) {

                if (arr[i] <= arr[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            // System.out.print(dp[i] + " ");
        }

        int max = dp[0];
        for (i = 1; i < arr.length; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.println(max);
    }

}
