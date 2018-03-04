package com.leetcode;

/**
 * Created by jamylu on 2018/3/4.
 * leetcode067
 * 二进制相加,a = "11" , b = "1" ,return "100"
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "110";
        String b = "101";
        System.out.println(addBinary(a, b));
        System.out.println(add(a, b));
    }

    // 我的粗暴方法
    public static String addBinary(String a, String b) {

        char[] arr1 = new StringBuffer(a).reverse().toString().toCharArray();
        char[] arr2 = new StringBuffer(b).reverse().toString().toCharArray();
        int len1 = a.length();
        int len2 = b.length();
        int ansLen = Math.max(len1, len2);
        int ans[] = new int[ansLen + 1];
        int i;
        String c = "";
        for (i = 0; i < len1; i++) {
            ans[i] = arr1[i] - '0';
        }
        for (i = 0; i < len2; i++) {
            ans[i] += arr2[i] - '0';
        }
        // 考虑二进制进位
        for (i = 0; i < ansLen; i++) {
            ans[i + 1] += ans[i] / 2;
            ans[i] %= 2;
            c += ans[i];
        }
        // 最高是1
        if (ans[i] == 1) {
            c += ans[i];
        }
        return new StringBuffer(c).reverse().toString();

    }

    // 借鉴的方法
    public static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; // 进位
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();

    }
}
