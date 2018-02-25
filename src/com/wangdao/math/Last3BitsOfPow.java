package com.wangdao.math;

public class Last3BitsOfPow {

    public static void main(String[] args) {
        int a = 2;
        int b = 31;
        System.out.println(pow(a, b));
    }

    // 返回a^b结果的后3位，二分求幂(b写成二进制形式,31:11111)
    public static int pow(int a, int b) {
        int ans = 1;
        while (b != 0) {
            // 当前二进制位为1
            if (b % 2 == 1) {
                ans *= a;
                ans %= 1000; // 取结果后三位
            }
            b /= 2;
            a *= a;
            a %= 1000; // 取a的后三位
        }
        return ans;
    }
}
