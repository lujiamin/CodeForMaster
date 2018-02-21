package tree;

import java.util.Scanner;

// 节点类
class Node {
	Node lChild;
	Node rChild;
	char data;

	Node() {
		lChild = null;
		rChild = null;
	}

	Node(char x) {
		this.data = x;
		lChild = null;
		rChild = null;
	}
}

/*
 * 利用先序遍历和中序遍历构建二叉树,并进行后序遍历
 */
public class Postorder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String preOrder = scanner.next();
		String inOrder = scanner.next();
		scanner.close();
		// char[] preOrder = { 'F', 'D', 'X', 'E', 'A', 'G' };
		// char[] inOrder = { 'X', 'D', 'E', 'F', 'A', 'G' };
		Node root = Create(preOrder.toCharArray(), inOrder.toCharArray());
		postOrder(root);
	}

	public static Node Create(char[] preOrder, char[] inOrder) {
		return build(0, 0, inOrder.length - 1, preOrder, inOrder);
	}

	public static Node build(int preStart, int inStart, int inEnd, char[] preOrder, char[] inOrder) {
		if (preStart > preOrder.length - 1 || inStart > inEnd) {
			return null;
		}
		// 利用先序遍历创建根节点
		Node root = new Node(preOrder[preStart]);
		int inIndex = 0; // 根节点在中序遍历中的下标
		for (int i = inStart; i <= inEnd; i++) {
			if (inOrder[i] == root.data) {
				inIndex = i;
			}
		}

		// 左子树，中序遍历跟节点的左半部分
		root.lChild = build(preStart + 1, inStart, inIndex - 1, preOrder, inOrder);
		// 右子树，中序遍历根节点的右半部分
		root.rChild = build(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preOrder, inOrder);
		return root;
	}

	// 后序遍历
	public static void postOrder(Node t) {
		if (t != null) {
			postOrder(t.lChild);
			postOrder(t.rChild);
			System.out.print(t.data);
		}
	}

}
