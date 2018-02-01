package com.leetcode;

/**
 * Created by jamylu on 2018/1/30.
 * leetcode413.
 * 一串序列中，存在连续等差序列(至少3个数)的个数
 */
public class ArithmeticSlices {

    // 动态规划 空间复杂度O(n)
    public int numberOfArithmeticSlices(int[] A) {
        int dp[] = new int[A.length];
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            // 符合等差
            if (A[i] + A[i - 2] == 2 * A[i - 1]) {
                dp[i] = dp[i - 1] + 1;

            }
            sum += dp[i];
        }
        return sum;
    }

    // O(1)
    public int num(int[] A) {
        int dp = 0;
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] + A[i - 2] == 2 * A[i - 1]) {
                dp = dp + 1;
                sum += dp;
            } else {
                dp = 0;
            }
        }
        return sum;
    }

    // recursion
    int sum = 0;
    public int num2(int[] A) {
        silces(A, A.length - 1);
        return sum;
    }
    public int silces(int[] A, int i) {
        if (i < 2) {
            return 0;
        }
        int ap = 0;
        if (A[i] + A[i - 2] == 2 * A[i - 1]) {
            ap = 1 + silces(A, i - 1);
            sum += ap;
        } else {
            silces(A, i - 1);
        }
        return ap;
    }
}
