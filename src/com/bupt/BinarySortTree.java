package com.bupt;

import java.util.Scanner;

/**
 * Created by jamylu on 2017/12/29.
 * 二叉排序树
 */
public class BinarySortTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            Node root = new Node(scanner.nextInt());
            while (--n > 0) {
                create(root, scanner.nextInt());
            }
            preOrder(root);
            System.out.println();
            inOrder(root);
            System.out.println();
            postOrder(root);
            System.out.println();
        }


    }

    public static void create(Node root, int data) {
        if (root.value == data) {
            return;
        }
        if (root.value < data) {
            if (root.right == null) {
                Node node = new Node(data);
                root.right = node;
            } else {
                create(root.right, data);
            }
        } else {
            if (root.left == null) {
                root.left = new Node(data);
            } else {
                create(root.left, data);
            }
        }
    }

    //先序遍历
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    //后序遍历
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    static class Node {
        int value;
        Node left;
        Node right;

        public Node() {

        }

        public Node(int data) {
            this.value = data;
            this.left = this.right = null;
        }
    }
}
