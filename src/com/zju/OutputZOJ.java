package com.zju;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/15.
 * 将字符串按ZOJ的顺序输出
 */
public class OutputZOJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            int mark[] = new int[3];
            int len = string.length();
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == 'Z') {
                    mark[0]++;
                }
                if (string.charAt(i) == 'O') {
                    mark[1]++;
                }
                if (string.charAt(i) == 'J') {
                    mark[2]++;
                }
            }
            while (len-- > 0) {
                if (mark[0] > 0) {
                    System.out.print('Z');
                    mark[0]--;
                }
                if (mark[1] > 0) {
                    System.out.print('O');
                    mark[1]--;
                }
                if (mark[2] > 0) {
                    System.out.print('J');
                    mark[2]--;
                }
            }

        }
        scanner.close();
    }
}
