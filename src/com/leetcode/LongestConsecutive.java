package com.leetcode;

import java.util.HashSet;

/**
 * Created by jamylu on 2017/12/30.
 * leetcode128.
 * 给定一个数组，返回最长的连续序列的长度
 */
public class LongestConsecutive {
    public static void main(String args[]) {
        int nums[] = {100, 4, 200, 1, 3, 2, 4, 6, 7, 8, 9, 10};
        System.out.println(longest(nums));
    }

    public static int longest(int[] num) {
        /*无法对负数进行处理，申请的数组空间也不好规定
        int arr[] = new int[1000];
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
        */

        //使用set集合
        HashSet<Integer> set = new HashSet<>();
        for (int i : num) {
            set.add(i);
        }
        int count = 0;
        for (int i : num) {
            int l = 1;
            int tmp = i;
            set.remove(i);
            while (set.contains(++tmp)) {
                l++;
                set.remove(tmp);
            }
            tmp = i;
            while (set.contains(--tmp)) {
                l++;
                set.remove(tmp);
            }
            count = Math.max(count, l);
        }
        return count;
    }
}
