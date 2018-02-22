package com.wangdao.date;

import java.util.Scanner;

/*
 * 两个日期之间的天数
 */
public class Days {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();

        int aYear = Integer.parseInt(a.substring(0, 4));
        int aMonth = Integer.parseInt(a.substring(4, 6));
        int aDay = Integer.parseInt(a.substring(6));

        int bYear = Integer.parseInt(b.substring(0, 4));
        int bMonth = Integer.parseInt(b.substring(4, 6));
        int bDay = Integer.parseInt(b.substring(6));

        // 分别计算和0000年1月1日的天数差
        int aDays = 0;
        int bDays = 0;

        int i, j;
        int monthDays[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 计算a
        for (i = 0; i < aYear; i++) {
            if (isLeap(i)) {
                aDays += 366;
            } else {
                aDays += 365;
            }
        }

        for (j = 1; j < aMonth; j++) {
            aDays += monthDays[j];
            if (j == 2 && isLeap(aMonth)) {
                aDays++;
            }
        }
        aDays += aDay;

        // 计算b
        for (i = 0; i < bYear; i++) {
            if (isLeap(i)) {
                bDays += 366;
            } else {
                bDays += 365;
            }
        }

        for (j = 1; j < bMonth; j++) {
            bDays += monthDays[j];
            if (j == 2 && isLeap(bMonth)) {
                bDays++;
            }
        }
        bDays += bDay;

        System.out.println(bDays - aDays + 1);
    }

    // 闰年判断
    public static boolean isLeap(int year) {
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

}
