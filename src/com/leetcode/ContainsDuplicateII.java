package com.leetcode;

import java.util.HashMap;

/**
 * Created by jamylu on 2018/1/7.
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        System.out.println(contains(nums, k));
    }

    //借助HashMap
    public static boolean contains(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (map.get(nums[i]) - i >= -k) && (map.get(nums[i]) - i) <= k) {
                return true;
            } else {
                map.put(nums[i], i);//由于key值的唯一性，会覆盖先前的值
            }
        }
        return false;
    }

    //暴力法，超时
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i - k; j <= i + k; j++) {
                if (j >= 0 && j < nums.length && j != i && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
