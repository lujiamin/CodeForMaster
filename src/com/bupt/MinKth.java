package com.bupt;

import java.util.*;

/**
 * Created by Administrator on 2017/12/27.
 */
public class MinKth {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Set<Integer> set = new TreeSet<>();//排序加去重
            for (int i = 0; i < n; i++) {
                set.add(scanner.nextInt());
            }
            int k = scanner.nextInt();
            Iterator<Integer> iterator = set.iterator();
            for (int i = 1; i < k; i++) {
                iterator.next();

            }
            System.out.println(iterator.next());
        }
    }
}
