package com.leetcode;

/**
 * Created by jamylu on 2018/1/6.
 * leetcode121.
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction,
 * design an algorithm to find the maximum profit.
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(getMaxProfit(prices));
    }


    public static int getMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (prices[i] - minPrice > max) {
                max = prices[i] - minPrice;
            }
        }
        return max;
    }

    //暴力法，超时
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int tmp;
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                tmp = prices[j] - prices[i];
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        return max;
    }
}
