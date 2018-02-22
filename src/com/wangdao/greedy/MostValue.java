package com.wangdao.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * mԪǮ���򵽶��ٰ���Ʒ
 * ̰���㷨
 */

class Goods {
    double weight; // ����
    double price; // ��ֵ
    double singleWeight; // ������ֵ��

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
            // ����n����Ʒ�ռ�
            Goods goods[] = new Goods[n];
            for (int i = 0; i < n; i++) {
                goods[i] = new Goods();
                goods[i].weight = scanner.nextDouble(); // ��������
                goods[i].price = scanner.nextDouble(); // �����ֵ
                goods[i].singleWeight = goods[i].weight / goods[i].price;
            }
            // ��������ֵ������
            Arrays.sort(goods, new Comparator<Goods>() {

                @Override
                public int compare(Goods o1, Goods o2) {
                    return (o2.singleWeight - o1.singleWeight) > 0 ? 1 : -1; // ��������
                }
            });
            for (int i = 0; i < n; i++) {
                System.out.println(goods[i].toString());
            }
            // ����Ϊ̰���㷨
            int k = 0;
            double ans = 0;
            while (m > 0 && k < n) {
                // ʣ�µ�Ǯ���ڸ���Ʒ���ܼ�ֵ
                if (m > goods[k].price) {
                    ans += goods[k].weight;
                    m -= goods[k].price;
                } else {
                    ans += m / goods[k].price * goods[k].weight;
                    m = 0; // ����
                }
                k++; // ��һ����Ʒ
            }
            System.out.println(ans);
        }
        scanner.close();
    }

}
