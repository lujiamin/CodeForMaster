package tree;

import java.util.Scanner;

// �ڵ���
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
 * ������������������������������,�����к������
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
		// ������������������ڵ�
		Node root = new Node(preOrder[preStart]);
		int inIndex = 0; // ���ڵ�����������е��±�
		for (int i = inStart; i <= inEnd; i++) {
			if (inOrder[i] == root.data) {
				inIndex = i;
			}
		}

		// ������������������ڵ����벿��
		root.lChild = build(preStart + 1, inStart, inIndex - 1, preOrder, inOrder);
		// ������������������ڵ���Ұ벿��
		root.rChild = build(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preOrder, inOrder);
		return root;
	}

	// �������
	public static void postOrder(Node t) {
		if (t != null) {
			postOrder(t.lChild);
			postOrder(t.rChild);
			System.out.print(t.data);
		}
	}

}
