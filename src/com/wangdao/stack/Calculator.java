package com.wangdao.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * ����һ��ֻ���� +, -, *, / �ķǸ�����������ʽ������ñ��ʽ��ֵ��
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();

        Stack<Double> operand = new Stack<Double>(); // ����ջ
        Stack<Character> operator = new Stack<Character>(); // �����ջ

        for (int i = 0; i < exp.length(); i++) {

        }
        scanner.close();

    }

}
