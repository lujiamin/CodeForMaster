package com.leetcode;

import java.util.Set;

/**
 * Created by jamylu on 2018/1/31.
 * leetcode139.
 * 一个字符串是否能被集合内的字符串拆分
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                // j~i构成的字符串
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
