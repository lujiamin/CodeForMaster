package com.wangdao.math;

/*
 * ŷ��������Լ��
 */
public class Gcd {

    public static void main(String[] args) {
        int a = 24, b = 230;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int t;
        while (min != 0) {
            t = max % min;
            max = min;
            min = t;
        }
        System.out.println(max);
    }

}
