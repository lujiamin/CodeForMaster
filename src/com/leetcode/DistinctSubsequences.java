package com.leetcode;

/**
 * Created by jamylu on 2018/2/1.
 * leetcode115.
 * S的子串有多少个和T相同
 */
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        // s为原字符串，t为子字符串.构造二维数组
        int dp[][] = new int[t.length() + 1][s.length() + 1];
        for (int i = 1; i <= t.length(); i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= s.length(); i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i <= t.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                dp[i][j] = dp[i][j - 1];
                if (s.charAt(j - 1) == t.charAt(i - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}
