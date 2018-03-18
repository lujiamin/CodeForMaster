package com.dp;

/**
 * Created by jamylu on 2018/3/18.
 * 找零问题
 */
public class GetMoney {
    public int countWays(int[] changes, int n, int x) {
        //抄袭的代码
        int[] dp = new int[x + 1];
        dp[0] = 1;
        for (int change : changes) {
            for (int i = 0; i + change <= x; i++) {
                dp[i + change] += dp[i];
            }
        }
        return dp[x];
    }
}
