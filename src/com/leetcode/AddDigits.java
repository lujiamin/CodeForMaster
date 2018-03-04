package com.leetcode;

/**
 * Created by jamylu on 2018/3/4.
 * leetcode258
 * 将一个数的每一位相加，依次往下，直至这个数变成一位
 */
public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
        System.out.println(add(num));
    }

    // 暴力法可以通过
    public static int addDigits(int num) {
        int tmp = 0;
        if (num <= 9) {
            return num;
        } else {
            while (num > 9) {
                while (num > 0) {
                    tmp += num % 10;
                    num /= 10;
                }
                num = tmp;
                tmp = 0;
            }
            return num;

        }
    }

    // 简单解法，巧妙利用9的倍数的各位数相加仍然是9的倍数
    public static int add(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }
}
