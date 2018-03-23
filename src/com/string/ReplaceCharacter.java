package com.string;

/**
 * Created by jamylu on 2018/3/21.
 * 用给定字符集合替换字符串中的 %s，多余的加在字符串末尾
 */
public class ReplaceCharacter {
    public static void main(String[] args) {
        String A = "A%sC%sE";
        int n = A.length();
        char[] arg = {'B', 'D', 'F'};
        int m = arg.length;
        System.out.println(formatString(A, n, arg, m));
    }

    public static String formatString(String A, int n, char[] arg, int m) {
        String ans = ""; // 尽量使用StringBuilder()
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '%' && A.charAt(i + 1) == 's') {
                ans += arg[k++];
                i++;
            } else {
                ans += A.charAt(i);
            }
        }
        while (k < m) {
            ans += arg[k++];
        }
        return ans;
    }
}
