package com.leetcode;

/**
 * Created by jamylu on 2018/1/1.
 * leetcode014
 * 最长公共前缀
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"leetcode", "leet", "leetdoe", "leetcd"};
        System.out.println(common(strs));
    }

    public static String common(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(ans) != 0) {
                ans = ans.substring(0, ans.length() - 1);
                if (ans.isEmpty()) {
                    return "";
                }
            }
        }
        return ans;
    }
}
