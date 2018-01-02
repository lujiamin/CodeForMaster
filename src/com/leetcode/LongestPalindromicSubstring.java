package com.leetcode;

/**
 * Created by jamylu on 2018/1/2.
 * leetcode005
 * 字符串的最长回文子串，假设字符串最长为1000
 */
public class LongestPalindromicSubstring {
    public static void main(String args[]) {
        String s = "ccc";
        System.out.print(longestPalindrome_dp(s));
    }

    public static String longestPalindrome_center(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    //进行中心拓展，返回以该位置为中心的回文串的长度
    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L + 1;
    }


    //以下是动态规划方法
    public static String longestPalindrome_dp(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        boolean dp[][] = new boolean[s.length()][s.length()];
        int start = 0;
        int max = 1;
        // 初始化数组
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                max = 2;
            }
        }
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                int j = i + len - 1;
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    max = len;
                    start = i;
                }
            }
        }
        if (max > 0) {
            return s.substring(start, start + max);
        } else
            return "";
    }


    // 以下是暴力法，超时
    public static String longestPalindrome(String s) {
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (j - i + 1 > max) {
                    if (isPalindrome(s.substring(i, j + 1))) {
                        max = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                } else {
                    continue;
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String s) {
        int k = s.length() / 2;
        int i, j;
        if (s.length() % 2 == 0) {
            i = k - 1;
            j = k;
        } else {
            i = k - 1;
            j = k + 1;
        }
        for (; i >= 0 && j <= s.length() - 1; i--, j++) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
