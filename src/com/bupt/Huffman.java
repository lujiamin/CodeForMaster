package com.bupt;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/5.
 */
public class Huffman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(n);
            while (n-- > 0) {
                priorityQueue.add(scanner.nextInt());// 加入即创建优先权队列
            }
//            System.out.println(priorityQueue);
            int result = 0;
            while (priorityQueue.size() > 1) {
                int a = priorityQueue.poll();
                int b = priorityQueue.poll();
                result += a + b;
                priorityQueue.add(a + b);
            }
            System.out.println(result);
        }
    }
}
