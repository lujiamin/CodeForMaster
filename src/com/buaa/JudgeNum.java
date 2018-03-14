package com.buaa;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/14.
 */
public class JudgeNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (x % 2 == 0) { // 偶数
                    count++;
                } else {
                    count--;
                }
            }
            // 偶数比奇数多输出YES
            if (count > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        scanner.close();
    }

}
