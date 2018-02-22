package com.wangdao.huffman;

/*
 * 哈夫曼树的带权路径
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class TotalWeight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int ans = 0;
        int a, b;
        for (int i = 0; i < n; i++) {
            priorityQueue.add(scanner.nextInt());
        }
        // 优先权
        while (priorityQueue.size() > 1) {
            a = priorityQueue.poll();
            b = priorityQueue.poll();
            ans += a;
            ans += b;
            priorityQueue.offer(a + b); // offer() or add()
        }
        System.out.println(ans);
        scanner.close();
    }

}
