package com.zju;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/15.
 * 定义能accept的字符串规则
 * 1)zoj
 * 2)xzojx,x可以是n个'o'或者空
 * 3)若azbjc能accept，则azbojac也能accept，其中a,b,c为n个'o'或者空
 * 题意即是说 azbjc，b中'o'的个数至少是1，且a*b == c
 */
public class AcceptZOJ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            int indexZ = string.indexOf('z'), indexJ = string.indexOf('j');
            if (indexZ == -1 || indexJ == -1) {
                System.out.println("Wrong Answer");
            } else {
                int a = indexZ;
                int b = indexJ - indexZ - 1;
                int c = string.length() - indexJ - 1;
                if (b == 0) {
                    System.out.println("Wrong Answer");
                } else if (a * b == c) {
                    System.out.println("Accepted");
                } else {
                    System.out.println("Wrong Answer");
                }
            }

        }
        scanner.close();
    }
}
