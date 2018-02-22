package com.wangdao.math;

import java.math.BigInteger;

public class BigNum {

    public static void main(String[] args) {
        // 以字符串保存大整数
        BigInteger a = new BigInteger("20");
        System.out.println(pow(a, 5));
        System.out.println(factorial(a));
    }

    // 大数求幂
    public static BigInteger pow(BigInteger a, int n) {
        if (n == 0)
            return BigInteger.valueOf(1);
        if (n == 1) {
            return a;
        } else {
            return a.multiply(pow(a, n - 1));
        }
    }

    // 大数求阶乘
    public static BigInteger factorial(BigInteger n) {
        BigInteger ans = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            ans = ans.multiply(i);
        }
        return ans;
    }

}
