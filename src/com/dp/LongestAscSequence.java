package com.dp;

/**
 * Created by jamylu on 2018/3/18.
 * 最长的递增子序列
 */
public class LongestAscSequence {

    public static void main(String[] args) {
        int A[] = {157, 232, 6};
        int n = A.length;
        System.out.println(findLongest(A, n));
    }

    // 动态规划方法
    public static int findLongest(int[] A, int n) {
        int[] dp = new int[n];// 记录以i结尾的序列的最长递增序列，初始化为1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            // 下标从0-i之间的以j结尾的子序列
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j])
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
        }
        // 找出其中最大的
        int ans = 1;
        for (int i = 0; i < n; i++) {
            if (ans < dp[i])
                ans = dp[i];
        }
        return ans;
    }
}
