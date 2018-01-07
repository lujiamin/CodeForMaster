package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jamylu on 2018/1/7.
 * leetcode217.
 * Given an array of integers, find if the array contains any duplicates.
 */
public class ContainsDuplicate {
    public static void main(String[] args) {

    }

    //利用HashSet.
    public static boolean judge(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
