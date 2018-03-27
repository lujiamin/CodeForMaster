package com.leetcode;

/**
 * Created by jamylu on 2018/3/27.
 * leetcode074
 * m*n
 * 每行中的整数从左到右排序
 * 每行的第一个整数大于前一行的最后一个整数
 */
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length - 1; // 行数
        if (m == -1) {
            return false;
        }
        int n = matrix[0].length - 1; // 列数
        if (n == -1) {
            return false;
        }

        int i = 0, j = 0, mid = 0;
        // 找到对应的行
        while (i <= m) {
            mid = (i + m) / 2;
            if (matrix[mid][0] == target)
                return true;
            if (mid + 1 <= m && matrix[mid + 1][0] > target && matrix[mid][0] < target)
                break;
            if (matrix[mid][0] < target) {
                i = mid + 1;
            } else {
                m = mid - 1;
            }
        }
//        System.out.println(mid);

        while (j <= n) {
            int middle = (j + n) / 2;
            if (matrix[mid][middle] == target)
                return true;
            if (matrix[mid][middle] > target) {
                n = middle - 1;
            } else {
                j = middle + 1;
            }
        }
        return false;
    }
}
