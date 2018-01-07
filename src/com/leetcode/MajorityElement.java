package com.leetcode;

/**
 * Created by jamylu on 2018/1/7.
 * leetcode169.
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {6, 5, 5};
        System.out.println(majorityElement(nums));
    }

    //摩尔投票算法
    public static int majorityElement(int[] nums) {
        int tmp = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                tmp = nums[i];
            if (tmp == nums[i])
                count++;
            else
                count--;
        }
        return tmp;
    }
}
