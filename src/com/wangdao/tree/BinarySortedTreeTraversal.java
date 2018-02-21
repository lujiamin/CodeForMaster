package tree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int x) {
		this.val = x;
	}
}

/*
 * 二叉排序树的创建和遍历
 */
public class BinarySortedTreeTraversal {

	static String inorderString = "";
	static String preorderString = "";

	public static void main(String[] args) {

		int[] nodes = { 6, 5, 9, 8, 1 };
		TreeNode root = new TreeNode(nodes[0]);
		create(root, nodes);
		preOrder(root);

	}

	public static void create(TreeNode root, int[] nodes) {
		for (int i = 1; i < nodes.length; i++) {
			add(root, nodes[i]);
		}
	}

	// 一定要返回根节点
	public static TreeNode add(TreeNode root, int x) {
		if (root == null) {
			root = new TreeNode(x);
			return root;
		}
		if (x < root.val) {
			root.left = add(root.left, x);
		} else if (x > root.val) {
			root.right = add(root.right, x);
		}
		return root;
	}

	// 先序遍历
	public static void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	// 中序遍历
	public static void inOrder(TreeNode root) {
		if (root != null) {
			preOrder(root.left);
			System.out.println(root.val);
			inorderString += root.val;
			preOrder(root.right);
		}
	}

}
