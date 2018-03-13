package com.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jamylu on 2018/2/1.
 * leetcode017.
 * 给出拨号盘上的数字组合返回可能的字母组合
 */
public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {

        String digits = "123";
        System.out.println(letterCombinations(digits));

    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<>();
        if (digits.length() == 0)
            return ans;
        ans.add("");
        String[] strings = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < digits.length(); i++) {
            int x = digits.charAt(i) - '0';
            // LinkedList的peek()方法是先进先出性质的
            while (ans.peek().length() == i) {
                String t = ans.remove(); // 取队头元素并删除
                for (char c : strings[x].toCharArray()) {
                    ans.add(t + c);
                }
            }
        }
        return ans;
    }
}
