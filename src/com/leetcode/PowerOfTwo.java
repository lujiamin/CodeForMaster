package com.leetcode;

/**
 * Created by jamylu on 2018/3/4.
 * leetcode231
 * 判断是不是2的幂
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n >>= 1;
        }
        return true;
    }
}
