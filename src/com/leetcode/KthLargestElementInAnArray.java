package com.leetcode;

import java.util.Arrays;

/**
 * Created by jamylu on 2018/3/27.
 * 找出数组中第k大数
 * leetcode215
 */
public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int nums[] = {3, 2, 1, 5, 6, 4};
        int k = 3;
        System.out.println(quickSort(nums, 0, nums.length - 1, k));
        System.out.println(find(nums, k));

    }


    // 利用快排思想
    public static int quickSort(int[] nums, int low, int high, int k) {
        if (low <= high) {
            int pos = partition(nums, low, high);
            if (pos == k - 1) {  // 下标正好是k-1
                return nums[pos];
            } else if (pos > k - 1) {
                return quickSort(nums, low, pos - 1, k); // 基准的左半部分
            } else {
                return quickSort(nums, pos + 1, high, k); // 基准的右半部分
            }
        } else
            return -1;

    }

    public static int partition(int[] nums, int low, int high) {
        int tmp = nums[low]; // 以第一个元素作为基准
        while (low < high) {
            // 从大到小排序
            while (low < high && nums[high] <= tmp)
                high--;
            nums[low] = nums[high];
            while (low < high && nums[low] >= tmp)
                low++;
            nums[high] = nums[low];
        }
        nums[low] = tmp;
        return low;
    }


    public static int find(int[] nums, int k) {
        // 排序做
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
