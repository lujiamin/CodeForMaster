package com.leetcode;

/**
 * Created by jamylu on 2018/3/27.
 * leetcode240
 * 每行中的整数从左到右按升序排列
 * 每列中的整数按从上到下的顺序排列
 */
public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1)
            return false;
        int row = 0;
        int col = matrix[0].length - 1;

        while (row <= matrix.length - 1 && col >= 0) {
            if (matrix[row][col] == target)
                return true;
            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
