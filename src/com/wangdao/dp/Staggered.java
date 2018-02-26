package com.wangdao.dp;

/**
 * Created by jamylu on 2018/2/26.
 * 错排公式，n封信都装错信封的可能数
 */
public class Staggered {
    public static void main(String[] args) {

        // dp：空间换时间
        int ans[] = new int[20];
        int i;
        ans[1] = 0;
        ans[2] = 1;
        for (i = 3; i < 20; i++) {
            ans[i] = (i - 1) * (ans[i - 1] + ans[i - 2]);
        }
        System.out.println(ans[10]);
    }

    // 递归实现
    public static int fun(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return (n - 1) * (fun(n - 1) + fun(n - 2));
    }

}
