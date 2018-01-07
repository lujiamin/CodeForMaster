package com.leetcode;

/**
 * Created by jamylu on 2018/1/7.
 * leetcode167.
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 */
public class TwoSumII {
    public static void main(String[] args) {
        int numbers[] = {2, 7, 9, 11};
        int target = 9;
        for (int i = 0; i < 2; i++) {
            System.out.println(sum(numbers, target)[i]);
        }
    }

    //双指针，一个向后，一个向前 O(n)
    public static int[] sum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (j > i) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{++i, ++j};
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[2];
    }
}
