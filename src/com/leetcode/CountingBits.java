package com.leetcode;

/**
 * Created by jamylu on 2018/1/30.
 * leetcode338.
 * 计算0~n内数的二进制形式中1的个数
 */
public class CountingBits {
    public int[] countBits(int n) {
        int result[] = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }
}
