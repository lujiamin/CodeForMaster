package com.dp;

/**
 * Created by jamylu on 2018/3/19.
 * 买卖股票，最多进行两次买入卖出
 */
public class BuyStocks {
    public int maxProfit(int[] prices, int n) {
        // 以i为界计算左右买卖的收益，取最大的left[i]+right[i]
        int[] left = new int[n];
        int[] right = new int[n];

        int min = prices[0];
        int max = prices[n - 1];

        int ans = 0;
        // i左边
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(prices[i] - min, left[i - 1]);
        }
        // i右边
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(max - prices[i], right[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, left[i] + right[i]);
        }
        return ans;
    }
}
