package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jamylu on 2018/1/3.
 * leetcode015.
 * Given an array S of n integers.Find all unique triplets in the array which gives the sum of zero.
 */
public class ThreeSum {

    public static void main(String[] args) {

        int[] nums = {0, 0, 0};
        System.out.println(threeS(nums));

    }

    public static List<List<Integer>> threeS(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length <= 2 || nums == null) {
            return list;
        }
        //先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 出现重复元素
            if (i - 1 > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            //双指针
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //出现重复则一直移动
                    while (left < right - 1 && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (right > left + 1 && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                if (sum < 0) {
                    left++;
                }
                if (sum > 0) {
                    right--;
                }
            }
        }
        return list;
    }
}
