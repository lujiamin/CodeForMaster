package com.leetcode;

/**
 * Created by jamylu on 2018/1/6.
 * leetcode122.
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * you must sell the stock before you buy again.
 */
public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    /*
    贪心算法，在每一小段上升序列中最大差值累加得到结果。
    就是说在股票价格处于上升期的时候，在最低点买入，在最高点卖出。
    而且可知，每一小段的最大差值就是这段序列的最后一个点的价格减去这段序列第一个点的价格，
    与每一次从第一个点与第二点的差值一直累加所得结果相同
     */
    public static int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                ans += (prices[i] - prices[i - 1]);
            }
        }
        return ans;
    }
}
