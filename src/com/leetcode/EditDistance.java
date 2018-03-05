package com.leetcode;

/**
 * Created by jamylu on 2018/3/5.
 * leetcode072
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2.
 * Insert a character
 * Delete a character
 * Replace a character
 * 优雅的动态规划
 */
public class EditDistance {
    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "b";
        System.out.println(minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {
        if (word1.equals(word2)) {
            return 0;
        }
        if (word1.length() == 0 || word2.length() == 0) {
            return Math.max(word1.length(), word2.length());
        }
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        int i, j;
        // 初始化，有一个单词长度为0时，则需要采取进行另一个单词的长度次操作
        for (i = 0; i <= word1.length(); i++) {
            dp[i][0] = i;
        }
        for (j = 0; j <= word2.length(); j++) {
            dp[0][j] = j;
        }
        for (i = 1; i <= word1.length(); i++) {
            for (j = 1; j <= word2.length(); j++) {
                // 刚好word1[i] == word2[j]时，下标从0开始，但是dp数组从1开始，dp[0][0]表示空串
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    // 如果不等，可以通过修改或者删除最后一个字符，增加一次操作
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
