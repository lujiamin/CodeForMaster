package com.leetcode;

/**
 * Created by jamylu on 2018/1/18.
 * leetcode034.
 * 给定一个有序数组，找出给定值所在的下标范围,要求是二分搜索
 */
public class SearchForARange {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        int[] ans = searchRange(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mid;
        int ansLeft;
        int ansRight;
        // 找左边界
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        ansLeft = left;
        if (nums == null || ansLeft == nums.length || nums[ansLeft] != target) {
            return new int[]{-1, -1};
        }
        left = 0;
        right = nums.length;
        // 找右边界
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        ansRight = left - 1;
        return new int[]{ansLeft, ansRight};
    }
}
