package com.leetcode;

/**
 * Created by jamylu on 2018/3/28.
 * leetcode097
 * 判断一个字符串是否由两个字符串交错而成
 */
public class InterleavingString {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        System.out.println(isInterleave(s1, s2, s3));
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length())
            return false;
        int i, j;
        int len1 = s1.length();
        int len2 = s2.length();
        boolean dp[][] = new boolean[len1 + 1][len2 + 1];
        // 动态规划
        for (i = 0; i <= len1; i++) {
            for (j = 0; j <= len2; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) { // s2为空
                    dp[i][j] = dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1);
                } else if (j == 0) { // s1为空
                    dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                } else {
                    dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
                }
            }
        }
        return dp[len1][len2];
    }
}
