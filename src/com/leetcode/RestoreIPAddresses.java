package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jamylu on 2018/3/7.
 * leetcode093
 * 还原IP地址
 */
public class RestoreIPAddresses {
    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restore(s));
    }

    public static List<String> restore(String s) {
        int i, j, k;
        int len = s.length();
        List<String> ans = new ArrayList<>();
        String tmp = "";
        // 注意substring()的取值范围
        for (i = 1; i < 4 && i < len - 2; i++) {
            for (j = i + 1; j < i + 4 && j < len - 1; j++) {
                for (k = j + 1; k < j + 4 && k < len; k++) {
                    if (isAddress(s.substring(0, i)) && isAddress(s.substring(i, j))
                            && isAddress(s.substring(j, k)) && isAddress(s.substring(k, len))) {
                        tmp += s.substring(0, i);
                        tmp += ".";
                        tmp += s.substring(i, j);
                        tmp += ".";
                        tmp += s.substring(j, k);
                        tmp += ".";
                        tmp += s.substring(k);
                        ans.add(tmp);
                        tmp = "";
                    }
                }
            }
        }
        return ans;
    }

    // 判断是否符合ip地址的范围
    public static boolean isAddress(String item) {
        if (item.length() > 3 || item.length() == 0) {
            return false;
        }
        if (item.charAt(0) == '0' && item.length() > 1 || Integer.parseInt(item) > 255) {
            return false;
        }
        return true;
    }
}
