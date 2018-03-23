package com.string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/23.
 * 计算字符的个数，并按个数降序输出
 */
public class ComputeNumOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        while (scanner.hasNext()) {
            string = scanner.next();
            compute(string);
        }
        scanner.close();
    }

    public static void compute(String string) {
        int[] arr = new int[256];
        for (int i = 0; i < string.length(); i++) {
            arr[string.charAt(i)]++;
        }
        int max = 0;
        for (int i = 0; i < 256; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        while (max > 0) {
            for (int i = 0; i < 256; i++) {
                if (max == arr[i]) {
                    sb.append((char) i);
                }

            }
            max--;
        }
        System.out.println(sb.toString());
    }
}
