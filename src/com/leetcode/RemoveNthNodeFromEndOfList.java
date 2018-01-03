package com.leetcode;

/**
 * Created by jamylu on 2018/1/3.
 * leetcode019.
 * Given a linked list, remove the nth node from the end of list and return its head.
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNth(ListNode head, int n) {
        ListNode front = new ListNode(-1);
        //添加头结点，使整个链表节点操作一致
        front.next = head;
        //双指针，q指针先前进n步
        ListNode p, q;
        p = front;
        q = front;
        while (n-- > 0) {
            q = q.next;
        }
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = p.next.next;
        return front.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
