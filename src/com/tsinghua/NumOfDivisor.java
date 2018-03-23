package com.tsinghua;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/22.
 * 计算一个数的约数个数
 */
public class NumOfDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
//            System.out.println(Integer.MAX_VALUE); // 7fffffff
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                getNum(scanner.nextInt());
            }
        }
        scanner.close();
    }

    public static void getNum(int n) {
        int ans = 0;
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                ans += 2;
            }
        }
        if (i * i == n) {
            ans += 1;
        }
        System.out.println(ans);
    }
}
