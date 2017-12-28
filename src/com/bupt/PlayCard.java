package com.bupt;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/28.
 */
public class PlayCard {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            String b = scanner.next();
            if (card(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean card(String a, String b) {
        char temp = b.charAt(0);
        switch (b.length()) {
            case 1:
                for (int i = 0; i < a.length(); i++) {
                    if (a.charAt(i) > temp)
                        return true;
                }
                return false;
            case 2:
                if (a.length() == 1) {
                    return false;
                } else {
                    for (int i = 0; i < a.length() - 1; i++) {
                        if (a.charAt(i) > temp && a.charAt(i + 1) == a.charAt(i))
                            return true;
                    }
                    return false;
                }
            case 3:
                if (a.length() <= 2) {
                    return false;
                } else {
                    for (int i = 0; i < a.length() - 2; i++) {
                        if (a.charAt(i) > temp && a.charAt(i + 1) == a.charAt(i) && a.charAt(i + 2) == a.charAt(i))
                            return true;
                    }
                    return false;
                }
            case 4:
                if (a.length() <= 3) {
                    return false;
                } else {
                    for (int i = 0; i < a.length() - 3; i++) {
                        if (a.charAt(i) > temp
                                && a.charAt(i + 1) == a.charAt(i)
                                && a.charAt(i + 2) == a.charAt(i)
                                && a.charAt(i + 3) == a.charAt(i))
                            return true;
                    }
                    return false;
                }
            case 5:
                if (a.length() <= 4) {
                    return false;
                } else {
                    for (int i = 0; i < a.length() - 4; i++) {
                        if (a.charAt(i) > temp
                                && a.contains("" + (a.charAt(i) - 47))
                                && a.contains("" + (a.charAt(i) - 46))
                                && a.contains("" + (a.charAt(i) - 45))
                                && a.contains("" + (a.charAt(i) - 44)))
                            return true;
                    }
                    return false;
                }

            default:
                return false;
        }
    }
}
