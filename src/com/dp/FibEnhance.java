package com.dp;

/**
 * Created by jamylu on 2018/3/19.
 * 斐波那契数列，但是较高的时间复杂度
 */
public class FibEnhance {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(getNthNumber(n));
    }

    // 超时
    public static int getNthNumber(int n) {
        int first = 1;
        int second = 1;
        int tmp;
        for (int i = 2; i < n; i++) {
            tmp = (first + second) % 1000000007;
            first = second;
            second = tmp;
        }
        return second;
    }
}
