package com.leetcode;

/**
 * Created by jamylu on 2018/3/5.
 * leetcode058
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String s = "hello world ";
        System.out.println(lengthOfWord(s));
    }

    // 分割
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        if (words.length == 0)
            return 0;
        else
            return words[words.length - 1].length();
    }

    // 从后往前两次遍历
    public static int lengthOfWord(String s) {
        int i = s.length() - 1;
        int len = 0;
        for (; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                break;
            }
        }
        for (; i > -1; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            } else {
                break;
            }
        }
        return len;
    }
}
