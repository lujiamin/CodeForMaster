package com.leetcode;

/**
 * Created by jamylu on 2018/1/2.
 * leetcode026
 * 有序数组，在O(1)的额外空间下，返回去重后的数组长度
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    //双指针，指向的值不同时移动慢的那个指针
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
