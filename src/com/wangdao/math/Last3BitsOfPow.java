package com.wangdao.math;

public class Last3BitsOfPow {

    public static void main(String[] args) {
        int a = 2;
        int b = 31;
        System.out.println(pow(a, b));
    }

    // ����a^b����ĺ�3λ����������(bд�ɶ�������ʽ,31:11111)
    public static int pow(int a, int b) {
        int ans = 1;
        while (b != 0) {
            // ��ǰ������λΪ1
            if (b % 2 == 1) {
                ans *= a;
                ans %= 1000; // ȡ�������λ
            }
            b /= 2;
            a *= a;
            a %= 1000; // ȡa�ĺ���λ
        }
        return ans;
    }
}
