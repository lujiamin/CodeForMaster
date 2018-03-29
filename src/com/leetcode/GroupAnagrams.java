package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jamylu on 2018/3/28.
 * leetcode049
 * 给一个字符串数组，将相同字谜组合在一起
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(group(strs));
    }

    // 将每个字符串转化为字符数组进行排序
    public static List<List<String>> group(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> map = new HashMap<>();

        for (String item : strs) {
            char[] arrs = item.toCharArray();
            Arrays.sort(arrs); // 对字符数组进行排序

            String key = String.valueOf(arrs); // 转化为string类型，作为map的key
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(item);
        }
        return new ArrayList<>(map.values());

    }
}
