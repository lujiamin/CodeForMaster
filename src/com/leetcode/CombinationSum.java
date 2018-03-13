package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jamylu on 2018/2/5.
 * leetcode039.
 * Find all unique combinations in C where the candidate numbers sums to T.
 */
public class CombinationSum {
    public static void main(String[] args) {

        int[] candidates = {2, 3, 5, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        getResult(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public static void getResult(List<List<Integer>> result, List<Integer> cur, int candidates[], int target, int start) {
        if (target > 0) {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                cur.add(candidates[i]);
                getResult(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1); // 移除指定下标的元素
            }
        } else if (target == 0) {
            result.add(new ArrayList<>(cur));
        }
    }
}
