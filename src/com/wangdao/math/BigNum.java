package com.wangdao.math;

import java.math.BigInteger;

public class BigNum {

    public static void main(String[] args) {
        // ���ַ������������
        BigInteger a = new BigInteger("20");
        System.out.println(pow(a, 5));
        System.out.println(factorial(a));
        String str1 = "13456";
        String str2 = "456789";
        System.out.println(add(str1, str2));
    }

    // ��������
    public static BigInteger pow(BigInteger a, int n) {
        if (n == 0)
            return BigInteger.valueOf(1);
        if (n == 1) {
            return a;
        } else {
            return a.multiply(pow(a, n - 1));
        }
    }

    // ������׳�
    public static BigInteger factorial(BigInteger n) {
        BigInteger ans = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            ans = ans.multiply(i);
        }
        return ans;
    }

    // ʹ���ַ����洢�Ĵ����ӷ�
    public static String add(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        int[] arr1 = new int[l1 + 1];
        int[] arr2 = new int[l2 + 1];
        int[] ans = new int[Math.max(l1, l2) + 1];
        int i = 0, j;
        for (j = l1 - 1; j >= 0; j--) {
            arr1[i++] = a.charAt(j) - '0';
        }
        i = 0;
        for (j = l2 - 1; j >= 0; j--) {
            arr2[i++] = b.charAt(j) - '0';
        }
        // ��λ���мӷ�����
        i = 0;
        int carry = 0;
        while (l1 > 0 && l2 > 0) {
            ans[i] = (arr1[i] + arr2[i] + carry) % 10;
            carry = (arr1[i] + arr2[i] + carry) / 10;
            i++;
            l1--;
            l2--;
        }
        while (l1 > 0) {
            ans[i] = (arr1[i] + carry) % 10;
            carry = (arr1[i] + carry) / 10;
            i++;
            l1--;
        }
        while (l2 > 0) {
            ans[i] = (arr2[i] + carry) % 10;
            carry = (arr2[i] + carry) / 10;
            i++;
            l2--;
        }
        i--;
        // ���λ�н�λ
        if (carry > 0) {
            ans[++i] = carry;
        }
        // ���ؽ���ַ���
        String str = "";
        while (i >= 0) {
            str += ans[i--];
        }
        return str;
    }


}
