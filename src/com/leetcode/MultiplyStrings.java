package com.leetcode;

/**
 * Created by jamylu on 2018/3/12.
 * leetcode043
 * 两个大整数的乘法
 */
public class MultiplyStrings {

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "45";
        System.out.println(multiply(num1, num2));
    }


    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int ans[] = new int[m + n];
        int sum;
        int mul;
        int pos1;
        int pos2;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                pos1 = i + j;
                pos2 = i + j + 1;
                sum = mul + ans[pos2];
                ans[pos1] += sum / 10;// 下一次循环的pos2位，累加的值
                ans[pos2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int item : ans) {
            if (sb.length() == 0 && item == 0) {

            } else {
                sb.append(item);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

}
