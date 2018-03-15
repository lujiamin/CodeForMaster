package com.zju;

import java.util.Stack;
import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/15.
 * 实现一个简单计算器
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            // 测试结束标志
            if (str.equals("0")) {
                break;
            }
            String elements[] = str.split(" ");
            Stack<Character> operate = new Stack<>();
            Stack<Double> operand = new Stack<>();
            int i;
            double result = 0;
            for (i = 0; i < elements.length; i++) {

                if (elements[i].equals("+") || elements[i].equals("-")) {// 加号和减号的情况
                    while (operand.size() > 1) {
                        double b = operand.pop();
                        double a = operand.pop();
                        switch (operate.pop()) {
                            case '+':
                                result = a + b;
                                break;
                            case '-':
                                result = a - b;
                                break;
                            case '*':
                                result = a * b;
                                break;
                            case '/':
                                result = a / b;
                                break;
                            default:
                                break;
                        }
                        operand.push(result);
                    }
                    operate.push(elements[i].charAt(0)); // 转化成char类型
                } else if (elements[i].equals("*") || elements[i].equals("/")) {// 乘号，除号的情况
                    while (operand.size() > 1 && (operate.peek() == '*' || operate.peek() == '/')) {
                        double b = operand.pop();
                        double a = operand.pop();
                        switch (operate.pop()) {
                            case '*':
                                result = a * b;
                                break;
                            case '/':
                                result = a / b;
                                break;
                            default:
                                break;
                        }
                        operand.push(result);
                    }
                    operate.push(elements[i].charAt(0));
                } else {// 数值的情况
                    operand.push(Double.parseDouble(elements[i]));
                }
            }
            while (!operate.isEmpty() && !operand.isEmpty()) {
                double b = operand.pop();
                double a = operand.pop();
                switch (operate.pop()) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        break;
                }
                operand.push(result);
            }
            System.out.printf("%.2f\n", operand.peek());
        }
        scanner.close();
    }
}
