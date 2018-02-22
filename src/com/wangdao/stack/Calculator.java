package com.wangdao.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * 读入一个只包含 +, -, *, / 的非负整数计算表达式，计算该表达式的值。
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();

        Stack<Double> operand = new Stack<Double>(); // 数字栈
        Stack<Character> operator = new Stack<Character>(); // 运算符栈

        for (int i = 0; i < exp.length(); i++) {

        }
        scanner.close();

    }

}
