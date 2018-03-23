package com.string;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/23.
 * 返回字符串中第一个未重复出现的字符
 */
public class FirstCharacterNoRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            System.out.println(firstAppearingOnce(string));
        }
        scanner.close();

    }

    public static char firstAppearingOnce(String string) {
        StringBuilder sb = new StringBuilder();
        int hash[] = new int[256];
        for (int i = 0; i < string.length(); i++) {
            // 字符第一次出现，将字符保存在字符串中
            if (hash[string.charAt(i)] == 0) {
                sb.append(string.charAt(i));
                hash[string.charAt(i)]++;
            } else {
                hash[string.charAt(i)]++;
            }
        }
        String tmp = sb.toString();
        for (int i = 0; i < sb.toString().length(); i++) {
            if (hash[tmp.charAt(i)] == 1) {
                return tmp.charAt(i);
            }
        }
        return '#';
    }
}
