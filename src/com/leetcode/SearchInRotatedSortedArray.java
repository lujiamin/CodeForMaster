package com.leetcode;

/**
 * Created by jamylu on 2018/1/18.
 * leetcode033.
 * 对于旋转过的有序数组进行二分搜索.
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // 旋转后的数组有两种情况
            if (nums[left] <= nums[mid]) {
                // 在左半部分
                if (target < nums[mid] && target >= nums[left])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            if (nums[mid] <= nums[right]) {
                // 在右半部分
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
