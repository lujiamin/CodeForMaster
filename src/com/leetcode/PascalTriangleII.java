package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamylu on 2018/1/6.
 * leetcode119.
 * Given an index k, return the kth row of the Pascal's triangle.
 * 在O(k)的额外空间内实现.
 */
public class PascalTriangleII {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getRow(n));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            //list添加元素的时候可以指定下标,并且会使对应位置的元素向右移动
            list.add(0, 1);
            for (int j = 1; j < list.size() - 1; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
//            System.out.println(list);
        }
        return list;
    }
}
