package com.divide;

/**
 * Created by jamylu on 2017/12/30.
 * 给定一个无序数组，按原顺序输出最小的k个数
 */
public class KthNumbers {
    public static void main(String[] args) {
        int A[] = {1, 2, 4, 3};
        int n = A.length;
        int k = 2;
        int ans[] = findKthNumbers(A, n, k);
        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    public static int[] findKthNumbers(int[] A, int n, int k) {
        int delete = n - k;
        int len = n;
        while (delete > 0) {
            int max = A[0];
            int flag = 0;
            //每一趟删除最大的那个数
            for (int i = 1; i < len; i++) {
                if (A[i] > max) {
                    max = A[i];
                    flag = i;
                }
            }
            for (int i = flag; i < len - 1; i++) {
                A[i] = A[i + 1];
            }
            len--;
            delete--;
        }
        int result[] = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = A[i];
        }
        return result;
    }

}
