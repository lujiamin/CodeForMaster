package com.leetcode;

/**
 * Created by jamylu on 2018/1/6.
 * leetcode088.
 * merger two sorted arrays,array1 has enough space.
 */
public class MergeSortedArray {
    public static void main(String[] args) {

    }

    //从后往前比较
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    //借助了辅助数组，增加了内存消耗
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                tmp[k++] = nums1[i++];
            } else {
                tmp[k++] = nums2[j++];
            }
        }
        while (i < m) {
            tmp[k++] = nums1[i++];
        }
        while (j < n) {
            tmp[k++] = nums2[j++];
        }
        for (i = 0; i < m + n; i++) {
            nums1[i] = tmp[i];
        }
    }
}
