package com.zju;

import java.util.Scanner;

/**
 * Created by jamylu on 2018/3/20.
 * 每一位的进制不一样，由质数组成
 */
public class AplusBMars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            if (a.equals('0') && b.equals('0')) {
                break;
            }
            System.out.println(plus(a, b));
        }
        scanner.close();
    }

    public static String plus(String a, String b) {
        StringBuilder ans = new StringBuilder();
        StringBuilder a1 = new StringBuilder(a);
        StringBuilder b1 = new StringBuilder(b);

        // 按','分割
        String[] arrA = a1.toString().split(",");
        String[] arrB = b1.toString().split(",");

        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int n = Math.max(arrA.length, arrB.length);
        int i = arrA.length - 1, j = arrB.length - 1, k = 0;
        int sum, carry = 0;

        int tmp[] = new int[n + 1];

        while (n-- > 0) {
            sum = 0;
            sum += carry;
            if (i >= 0) {
                sum += Integer.parseInt(arrA[i]);
                i--;
            }
            if (j >= 0) {
                sum += Integer.parseInt(arrB[j]);
                j--;
            }

            tmp[k] = sum % primes[k];
            carry = sum / primes[k];
            k++;
        }
        k--;
        if (carry > 0) {
            tmp[++k] = carry;
        }
        for (i = k; i >= 0; i--) {
            ans.append(tmp[i]);
            if (i == 0) {

            } else {
                ans.append(',');
            }
        }

        return ans.toString();

    }
}
