package com.leetcode;

/**
 * Created by jamylu on 2018/1/3.
 * leetcode053.
 * 最大连续子数组
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int max = nums[0];
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(max, current);
        }
        return max;
    }

    // 将空数组也看为子数组
    public static int maxSub(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            if (current > max) {
                max = current;
            }
            if (current < 0) {
                current = 0;
            }
        }
        return max;
    }
}
