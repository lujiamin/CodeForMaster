package com.wangdao.math;

import java.util.Scanner;

public class RadixConverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();// Ҫת���ɵĽ���
        int n = scanner.nextInt();// ��ת����ʮ������
        converse(base, n);
        scanner.close();
    }

    // ��������������ݹ�ʵ��
    private static void converse(int base, int n) {
        if (n > 0) {
            converse(base, n / base);
            System.out.print(n % base);
        }
    }

}
