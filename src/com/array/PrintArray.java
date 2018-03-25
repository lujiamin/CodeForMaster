package com.array;

/**
 * Created by jamylu on 2018/3/24.
 * n*n，从右上角到左下角沿主对角线
 */
public class PrintArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int n = arr.length;
        for (int i = 0; i < n * n; i++) {

            System.out.print(print(arr, n)[i] + " ");

        }

    }

    public static int[] print(int[][] arr, int n) {
        int ans[] = new int[n * n];
        int index = 0;
        int startX = 0;
        int startY = n - 1;
        while (startX < n) {
            int x = startX;
            int y = startY;
            while (x < n && y < n) {
                ans[index++] = arr[x++][y++];
            }
            if (startY > 0) {
                startY--;
            } else {
                startX++;
            }
        }
        return ans;
    }
}
