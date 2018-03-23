package com.string;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/21.
 * 将字符串向右移动
 */
public class ReverseK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            int n = scanner.nextInt();
            int p = scanner.nextInt();
            System.out.println(string.substring(p + 1, n) + string.substring(0, p + 1));
            System.out.println(reverse(string));
        }
        scanner.close();
}

    public static String reverse(String string) {
        String result = "";
        for (int i = string.length() - 1; i >= 0; i++) {
            result += string.charAt(i);
        }
        return result;
    }
}
