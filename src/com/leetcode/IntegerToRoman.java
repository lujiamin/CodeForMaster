package com.leetcode;

/**
 * Created by jamylu on 2018/3/11.
 * leetcode012
 * Integer to Roman
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        int num = 3164;
        System.out.println(intToRoman(num));
    }

    // oj通过
    public static String intToRoman(int num) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String strings[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            if (num >= values[i]) {
                num -= values[i];
                sb.append(strings[i]);
                i--;
            }
        }
        return sb.toString();
    }

}
