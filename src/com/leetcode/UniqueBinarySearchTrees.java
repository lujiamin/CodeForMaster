package com.leetcode;

/**
 * Created by jamylu on 2018/1/29.
 * leetcode096.
 * 不同形状的二叉搜索树的个数
 */
public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        System.out.println(numtrees(3));
    }
    // 分别看左子树和右子树不同形状的个数
    public static int numtrees(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }
}
