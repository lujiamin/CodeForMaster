package com.zju;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/15.
 * 统计字符出现的次数
 */
public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 空格也需要统计
            String stringA = scanner.nextLine();
            if (stringA.equals("#")) {
                break;
            }
            String stringB = scanner.nextLine(); // 需要统计的字符串
            

            for (int i = 0; i < stringA.length(); i++) {
                int count = 0;
                for (int j = 0; j < stringB.length(); j++) {
                    if (stringA.charAt(i) == stringB.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(stringA.charAt(i) + " " + count);
            }

            /*
            int[] counts = new int[stringA.length()];
            for (int i = 0; i < stringB.length(); i++) {
                for (int j = 0; j < stringA.length(); j++) {
                    if (stringB.charAt(i) == stringA.charAt(j)) {
                        counts[j]++;
                    }
                }
            }
            // 输出字符和个数
            for (int i = 0; i < stringA.length(); i++) {
                System.out.println(stringA.charAt(i) + " " + counts[i]);
            }
            */
        }
        scanner.close();
    }
}
