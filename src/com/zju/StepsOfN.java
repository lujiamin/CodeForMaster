package com.zju;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/15.
 * 对于一个数n，偶数砍掉一半，奇数变为3*n+1后砍掉一半，经过几步变成1
 */
public class StepsOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            // 结束标志
            if (n == 0)
                break;
            int steps = 0;
            while (n != 1) {
                if (n % 2 != 0) {
                    n = 3 * n + 1;
                    n /= 2;
                } else {
                    n /= 2;
                }
                steps++;
            }
            System.out.println(steps);
        }
        scanner.close();
    }
}
