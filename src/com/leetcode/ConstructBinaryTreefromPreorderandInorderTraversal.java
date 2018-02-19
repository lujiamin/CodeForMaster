package com.leetcode;

/**
 * Created by jamylu on 2018/2/19.
 * leetcode105
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(0, 0, inorder.length - 1, preorder, inorder);
    }

    //
    public TreeNode create(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > inorder.length - 1 || inStart > inEnd) {
            return null;
        }
        // 创建根节点
        TreeNode root = new TreeNode(preorder[preStart]);
        // 根节点在中序遍历中的下标
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
                break;
            }
        }
        root.left = create(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = create(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}
