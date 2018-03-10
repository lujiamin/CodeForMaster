package com.leetcode;

/**
 * Created by jamylu on 2018/3/8.
 * leetcode004
 * 找两个有序数组的中位数，时间复杂度为log(m+n)
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return 0.0;
        int m = nums1.length;
        int n = nums2.length;
        int l = (m + n + 1) / 2;
        int r = (m + n + 2) / 2;
        return (getkth(nums1, 0, nums2, 0, l) + getkth(nums1, 0, nums2, 0, r)) / 2.0;
    }

    public static double getkth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        if (start1 > nums1.length - 1)
            return nums2[start2 + k - 1];
        if (start2 > nums2.length - 1)
            return nums1[start1 + k - 1];
        if (k == 1)
            return Math.min(nums1[start1], nums2[start2]);
        int mid1 = Integer.MAX_VALUE;
        int mid2 = Integer.MAX_VALUE;
        if (start1 + k / 2 - 1 < nums1.length)
            mid1 = nums1[start1 + k / 2 - 1];
        if (start2 + k / 2 - 1 < nums2.length)
            mid2 = nums2[start2 + k / 2 - 1];
        if (mid1 < mid2) {
            return getkth(nums1, start1 + k / 2, nums2, start2, k - k / 2);
        } else {
            return getkth(nums1, start1, nums2, start2 + k / 2, k - k / 2);
        }

    }
}
