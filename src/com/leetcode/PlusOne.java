package com.leetcode;

/**
 * Created by Administrator on 2018/1/6.
 * leetcode066.
 * 用数组表示一个数的各位，进行加 1 操作.
 */
public class PlusOne {
    public static void main(String[] args) {
        int digits[] = {9, 9};
    }

    public static int[] plus(int[] digits) {
        int len = digits.length;
        if (digits[len - 1] < 9) {
            digits[len - 1]++;
        } else {
            digits[len - 1]++;
            for (int i = len - 1; i >= 1; i--) {
                digits[i - 1] += (digits[i]) / 10;
                digits[i] %= 10;
            }
            //考虑全是9的情况，产生进位
            if (digits[0] == 10) {
                digits[0] = 0;
                int[] ans = new int[len + 1];
                for (int i = 1; i < len + 1; i++) {
                    ans[i] = digits[i - 1];
                }
                ans[0] = 1;
                return ans;
            }

        }
        return digits;
    }
}
