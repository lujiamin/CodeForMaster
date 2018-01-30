package com.leetcode;

/**
 * Created by jamylu on 2018/1/30.
 * leetcode006.
 *
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (len == 0 || numRows < 2)
            return s;
        String ret = "";
        int lag = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < len; j += lag) {
                ret += s.charAt(j);
                if (i > 0 && i < numRows - 1) {
                    int t = j + lag - 2 * i;
                    if (t < len) {
                        ret += s.charAt(t);
                    }
                }
            }
        }
        return ret;
    }
}
