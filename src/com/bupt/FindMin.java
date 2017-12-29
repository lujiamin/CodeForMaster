package com.bupt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jamylu on 2017/12/29.
 * 找出一组数中的最小(x,y),以x小优先为序
 */
public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<Num> list = new ArrayList<>();
            while (n-- > 0) {
                list.add(new Num(scanner.nextInt(), scanner.nextInt()));
            }
            System.out.println(findMax(list).x + " " + findMax(list).y);
        }

    }

    public static Num findMax(ArrayList<Num> list) {
        Num min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).x < min.x || list.get(i).x == min.x && list.get(i).y < min.y) {
                min = list.get(i);
            }
        }
        return min;
    }

    static class Num {
        public int x;
        public int y;

        public Num() {

        }

        public Num(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
