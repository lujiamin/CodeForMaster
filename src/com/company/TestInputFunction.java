package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/15.
 * 测试java的输入函数性能
 */
public class TestInputFunction {
    public static void main(String[] args) throws IOException {
        testScanner();
        testBufferedReader(); // 性能大概是10倍的差距
    }

    public static void testScanner() {
        Scanner scanner = new Scanner(System.in);
        long start = System.nanoTime();
        String string = scanner.nextLine();
        long end = System.nanoTime();
        System.out.println(end - start);

    }

    public static void testBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long start = System.nanoTime();
        String string = bufferedReader.readLine();
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
