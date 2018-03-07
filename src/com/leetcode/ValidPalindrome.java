package com.leetcode;

/**
 * Created by jamylu on 2018/3/7.
 * leetcode125
 * 判断一个字符串是否是回文，只考虑字母和数字，不计大小写
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    
    public static boolean isPalindrome(String s) {
        if (s.equals(""))
            return true;
        int start = 0, end = s.length() - 1;
        while (start < end) {
            // 如果不是字母和空格则跳过
            if (!Character.isLetterOrDigit(s.charAt(start)))
                start++;
            else if (!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            else if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    // 超时
    public static boolean isPalindrome2(String s) {
        String tmp = "";
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                    || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'
                    || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                tmp += s.charAt(i);
            }
        }
        if (tmp.equals("")) {
            return true;
        }
        tmp = tmp.toLowerCase();
        int j = tmp.length() - 1;
        for (i = 0; i < j; i++, j--) {
            if (tmp.charAt(i) != tmp.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
