package trees;

public class LCA {
	public TreeNode findLCA(TreeNode root, int p, int q) {
		if (root == null || root.data == p || root.data == q)
			return root;

		TreeNode left = findLCA(root.left, p, q);
		TreeNode right = findLCA(root.right, p, q);

		if (left == null)
			return right;
		else if (right == null)
			return left;
		else
			return root;

	}
}
