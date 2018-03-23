package com.string;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/21.
 * 十六进制转化为十进制：OxA->10
 */
public class RadixTrans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
//            直接输出十进制
//            System.out.println(Integer.parseInt(string.substring(2), 16));
            trans(string);
        }
        scanner.close();
    }

    public static void trans(String string) {
        string = string.substring(2);
        int ans = 0;
        int tmp;
        for (int i = 0; i < string.length(); i++) {
            switch (string.charAt(i)) {
                case 'A':
                    tmp = string.charAt(i) - 'A' + 10;  // 不必使用分支处理
                    break;
                case 'B':
                    tmp = 11;
                    break;
                case 'C':
                    tmp = 12;
                    break;
                case 'D':
                    tmp = 13;
                    break;
                case 'E':
                    tmp = 14;
                    break;
                case 'F':
                    tmp = 15;
                    break;
                default:
                    tmp = string.charAt(i) - '0';
            }
            ans += tmp;
            if (i == string.length() - 1) {

            } else {
                ans *= 16;
            }
        }
        System.out.println(ans);
    }
}
