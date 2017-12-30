package com.recursion;

/**
 * Created by jamylu on 2017/12/30.
 * 使用递归将栈转置，不能使用其他数据结构
 */
public class ReverseStack {

    public static void main(String[] args) {
        int stack[] = {1, 2, 3, 4, 5};
        int top = 5;
        reverseStackRecursively(stack, top);
    }

    static int i = 0;

    public static int[] reverse(int[] stack, int top) {

        if (top > 0) {
            int a = stack[top - 1];
            i++;
            stack = reverse(stack, top - 1);
            i--;
            stack[i] = a;
        }
        return stack;
    }

    public static int[] reverseStackRecursively(int[] stack, int top) {
        // 全部反转，不符合题意
        int n = top / 2;
        for (int i = 0; i < n; i++) {
            int tmp = stack[i];
            stack[i] = stack[top - i - 1];
            stack[top - i - 1] = tmp;
        }
        return stack;
    }
}
