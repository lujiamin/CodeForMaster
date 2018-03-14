package com.buaa;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/14.
 * 输出2~n范围内个位为1的素数
 */
public class OutputPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            boolean mark[] = new boolean[n + 1]; // 默认false
            int i, j, begin = 0;
            for (i = 0; i <= n; i++) {
                mark[i] = true; // true代表素数
            }
            for (i = 2; i <= n; i++) {
                if (mark[i] == false) {
                    continue;
                }
                // 素数的倍数不是素数
                for (j = i * i; j <= n; j += i) {
                    mark[j] = false;
                }
            }
            // 不包含n
            for (i = 2; i < n; i++) {
                if (mark[i] && i % 10 == 1) {
                    // 控制输出格式
                    if (begin == 0) {
                        System.out.print(i);
                        begin++;
                    } else {
                        System.out.print(" " + i);
                    }
                }
            }

        }
        scanner.close();
    }
}
