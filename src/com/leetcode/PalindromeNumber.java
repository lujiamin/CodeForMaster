package com.leetcode;

/**
 * Created by jamylu on 2017/12/31.
 * leetcode009.回文数判断，通过比较每一位
 */
public class PalindromeNumber {
    public static void main(String args[]) {
        int x = -2147447412;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        //负数直接返回false
        if (x < 0) {
            return false;
        }
        x = Math.abs(x);
        int tmp = 1;
        // tmp 和 x的位数保持一致
        while (x / tmp >= 10) {
            tmp *= 10;
        }
        while (x != 0) {
            // 最高位和最低位比较
            // System.out.println(x / tmp + " " + x % 10);
            if (x / tmp != x % 10) {
                return false;
            }
            // 去掉最高位和最低位，tmp 缩小100倍，和x位数保持一致
            x = (x % tmp) / 10;
            tmp /= 100;
        }
        return true;
    }
}
