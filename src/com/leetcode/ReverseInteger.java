package com.leetcode;


/**
 * Created by jamylu on 2017/12/31.
 * leetcode007.
 */
public class ReverseInteger {

    public static void main(String args[]) {
        int n = -67670;
        System.out.println(reverse2(n));
    }

    public static int reverse2(int x) {
        int result = 0;
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return result;
        }
        while (x != 0) {
            int tail = x % 10;
            result = result * 10 + tail;
            x /= 10;
        }
        return result;
    }


    //不应该转化成字符串
    /*
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int flag = 0;
        String str = "";
        int tmp;
        if (x < 0) {
            flag = 1;
            x = -x;
        }
        if (x % 10 == 0) {

        } else {
            tmp = x % 10;
            str += tmp;
        }
        x /= 10;
        while (x > 0) {
            tmp = x % 10;
            str += tmp;
            x /= 10;
        }
        if (flag == 1) {
            return -Integer.parseInt(str);
        } else {
            return Integer.parseInt(str);
        }
    }
    */
}
