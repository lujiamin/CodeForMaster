package com.dp;

/**
 * Created by jamylu on 2018/3/19.
 * 一个数组中最少需要排序的子数组的长度
 */
public class ShortestSort {


    public static void main(String[] args) {
        int A[] = {1, 5, 3, 4, 2, 7, 6};
        int n = A.length;
        System.out.println(findShortest(A, n));
    }

    public static int findShortest(int[] A, int n) {
        int i;
        int start = 0;
        int end = n - 1;
        int min = A[n - 1];
        int max = A[0];
        // 找子数组的起始下标
        for (i = 0; i < n; i++) {
            if (A[i] >= max) {
                max = A[i];
            } else {
                end = i;
            }
        }
        System.out.println(end);
        // 找子数组的结束下标
        for (i = n - 1; i >= 0; i--) {
            if (A[i] <= min) {
                min = A[i];
            } else {
                start = i;
            }
        }
        System.out.println(start);
        if (start == 0 && end == n - 1) {
            return 0;
        }
        return (end - start + 1);
    }
}
