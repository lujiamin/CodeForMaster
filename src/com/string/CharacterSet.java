package com.string;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/21.
 * 输出字符串中字符集合，重复的不输出
 */
public class CharacterSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            getCharacterSet(s);
        }
        scanner.close();
    }

    // 使用集合

    public static void getCharacterSet(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {

            } else {
                System.out.print(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        System.out.println();
    }

    // 使用数组
    public static void getCharacter(String s) {
        boolean[] mark = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            if (mark[s.charAt(i)] == true) {

            } else {
                System.out.print(s.charAt(i));
                mark[s.charAt(i)] = true;
            }
        }
        System.out.println();

    }
}
