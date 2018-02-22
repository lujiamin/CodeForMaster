package com.wangdao.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * m元钱能买到多少磅物品
 * 贪心算法
 */

class Goods {
    double weight; // 重量
    double price; // 价值
    double singleWeight; // 重量价值比

    @Override
    public String toString() {
        return "Goods [weight=" + weight + ", price=" + price + ", singleWeight=" + singleWeight + "]";
    }

}

public class MostValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            // 申请n个物品空间
            Goods goods[] = new Goods[n];
            for (int i = 0; i < n; i++) {
                goods[i] = new Goods();
                goods[i].weight = scanner.nextDouble(); // 输入重量
                goods[i].price = scanner.nextDouble(); // 输入价值
                goods[i].singleWeight = goods[i].weight / goods[i].price;
            }
            // 按重量价值比排序
            Arrays.sort(goods, new Comparator<Goods>() {

                @Override
                public int compare(Goods o1, Goods o2) {
                    return (o2.singleWeight - o1.singleWeight) > 0 ? 1 : -1; // 降序排列
                }
            });
            for (int i = 0; i < n; i++) {
                System.out.println(goods[i].toString());
            }
            // 以下为贪心算法
            int k = 0;
            double ans = 0;
            while (m > 0 && k < n) {
                // 剩下的钱大于该物品的总价值
                if (m > goods[k].price) {
                    ans += goods[k].weight;
                    m -= goods[k].price;
                } else {
                    ans += m / goods[k].price * goods[k].weight;
                    m = 0; // 结束
                }
                k++; // 下一个物品
            }
            System.out.println(ans);
        }
        scanner.close();
    }

}
