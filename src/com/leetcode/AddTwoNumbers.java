package com.leetcode;

/**
 * Created by jamylu on 2018/2/1.
 * leetcode002.
 * add two linked lists representing two non-negative integers.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1); // 初始化单链表
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p = ans;
        int extra = 0; // 进位
        while (p1 != null || p2 != null) {
            // 如果节点为null,用0代替
            int a = p1 != null ? p1.val : 0;
            int b = p2 != null ? p2.val : 0;
            int sum = (a + b + extra) % 10;
            extra = (a + b + extra) / 10;
            p.next = new ListNode(sum);
            p = p.next;
            if (p1 != null)
                p1 = p1.next;
            if (p2 != null)
                p2 = p2.next;
        }
        // 最后产生进位
        if (extra > 0) {
            p.next = new ListNode(extra);
        }
        return ans.next;
    }
}
