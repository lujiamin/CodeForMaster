package com.leetcode;

/**
 * Created by jamylu on 2018/1/3.
 * leetcode027.
 * 移除数组中等于val的元素，并返回剩余数组的长度.
 */
public class RemoveElement {
    public static void main(String[] args) {

        int nums[] = {3, 2, 2, 3};
        int val = 3;
        System.out.println("\n" + remove(nums, val));

    }

    public static int remove(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] == val) {
                i++;
            } else {
                nums[j] = nums[i];
                j++;
                i++;
            }
        }
        return j;
    }
}
