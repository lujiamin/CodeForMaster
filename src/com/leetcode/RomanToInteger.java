package com.leetcode;

/**
 * Created by jamylu on 2017/12/31.
 * leetcode013.
 * 罗马数字转化为整型，主要是理解罗马数字表示的含义
 */
public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("CDIV"));
    }

    public static int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    if (res >= 5)
                        res += -1;
                    else
                        res += 1;
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    if (res >= 50)
                        res += -10;
                    else
                        res += 10;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    if (res >= 500)
                        res += -100;
                    else
                        res += 100;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }
}
