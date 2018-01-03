package com.leetcode;

/**
 * Created by jamylu on 2018/1/3.
 * leetcode011.
 * 给定n个非负整数a1 a2。其中每个表示坐标点(i,ai)。
 * n垂直的线是这样画的，直线i的两个端点在(i,ai)和(i,0)中，
 * 找到两条直线，它们与x轴一起构成一个容器，这样容器就包含了最多的水。
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(mostWater(height));
        System.out.println(maxArea(height));

    }

    //双指针法，一前一后向中间靠拢
    public static int mostWater(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        int current;
        while (j > i) {
            current = (j - i) * Math.min(height[i], height[j]);
            if (current > max) {
                max = current;
            }
            //影响容器盛水的是矮的那个
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    //暴力法，超时
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++)
                if ((j - i) * Math.min(height[i], height[j]) > max) {
                    max = (j - i) * Math.min(height[i], height[j]);
                }
        }
        return max;
    }
}
