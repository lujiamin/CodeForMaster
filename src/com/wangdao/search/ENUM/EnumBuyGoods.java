package com.wangdao.search.ENUM;

/**
 * Created by jamylu on 2018/2/26.
 */
public class EnumBuyGoods {
    public static void main(String[] args) {
        int n = 40;// 输入的金额
        int z;
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100 - x; y++) {
                z = 100 - x - y;
                // 金额可有剩余
                if (5 * x * 3 + 3 * y * 3 + z <= n * 3) {
                    System.out.println("x=" + x + " y=" + y + " z=" + z);
                }
            }
        }
    }
}
