package com.leetcode;

import java.util.Arrays;

/**
 * Created by jamylu on 2018/1/18.
 * leetcode031.
 * 找出按字典序排序的下一个序列.如果是递减序列则返回排好序的递增序列
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 4, 7, 6, 5, 3, 1};
        next(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void next(int[] nums) {
        int i = nums.length - 2;
        // 从后往前找出第一个递减的数的下标
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = i + 1;
            int min = nums[j];
            int flag = j;

            // 找出在i之后比nums[i]大的最小数
            for (; j <= nums.length - 1; j++) {
                if (nums[j] > nums[i] && min > nums[j]) {
                    min = nums[j];
                    flag = j;
                }
            }

            // 交换nums[i]和nums[j]
            int temp = nums[i];
            nums[i] = nums[flag];
            nums[flag] = temp;
        }
        // 重排nums[i+1]到nums[len-1]为递增序列
        Arrays.sort(nums, i + 1, nums.length);
    }
}
