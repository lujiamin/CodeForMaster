package com.wangdao.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * ����һ��ֻ���� +, -, *, / �ķǸ�����������ʽ������ñ��ʽ��ֵ��
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            if (str.equals("0")) {
                break;
            }
            String elements[] = str.split(" ");
            Stack<Character> operate = new Stack<>();
            Stack<Double> operand = new Stack<>();
            int i;
            double result = 0;
            for (i = 0; i < elements.length; i++) {

                if (elements[i].equals("+") || elements[i].equals("-")) {// �Ӻźͼ��ŵ����
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
                    operate.push(elements[i].charAt(0)); // ת����char����
                } else if (elements[i].equals("*") || elements[i].equals("/")) {// �˺ţ����ŵ����
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
                } else {// ��ֵ�����
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
