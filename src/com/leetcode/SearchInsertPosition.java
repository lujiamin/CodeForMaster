package com.leetcode;

/**
 * Created by jamylu on 2018/1/3.
 * leetcode035
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(BinSearchInsert(nums, target));
    }

    //二分搜索
    public static int BinSearchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return low;
    }


    // 直接遍历，O(n)
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.length;
    }
}
