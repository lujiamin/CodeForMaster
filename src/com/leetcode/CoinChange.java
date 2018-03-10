package com.leetcode;

import java.util.Arrays;

/**
 * Created by jamylu on 2018/3/9.
 * leetcode322
 * 零钱找零问题
 */
public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(minNum(coins, amount));
    }

    // 最少硬币个数的找零组合
    public static int minNum(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    // 零钱组合的种数
    public static int ways(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int item : coins) {
            for (int i = 0; i + item <= amount; i++) {
                dp[i + item] += dp[i];
            }
        }
        return dp[amount];
    }
}
