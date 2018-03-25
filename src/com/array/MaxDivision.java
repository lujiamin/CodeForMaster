package com.array;

/**
 * Created by jamylu on 2018/3/24.
 * 在O(n)时间复杂度的情况下，返回排序后相邻元素的最大差值
 */
public class MaxDivision {

    public static void main(String[] args) {
        int A[] = {208, 254, 473, 153, 389, 579, 398};
        int n = A.length;
        System.out.println(findMaxDivision(A, n));
    }

    // 找最大数和最小数，往中间填，求连续最大0的数量
    public static int findMaxDivision(int[] A, int n) {

        int min = A[0];
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }

        int arr[] = new int[max - min + 1];
        for (int i = 0; i < n; i++) {
            arr[A[i] - min]++;
        }

        int ans = 0;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cur++;
            } else {
                if (ans < cur) {
                    ans = cur;
                }
                cur = 0;
            }
        }
        // ans表示最大0的个数
        return ans + 1;
    }

}
