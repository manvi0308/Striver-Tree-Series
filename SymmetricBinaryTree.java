package trees;

public class SymmetricBinaryTree {
	static boolean symmetricUtil(TreeNode r1, TreeNode r2) {
		if(r1 == null && r2 == null)
			return true;
		if(r1 == null || r2 == null)
			return false;
		
		return (r1.data == r2.data) && symmetricUtil(r1.left, r2.right) 
				&& symmetricUtil(r1.right, r2.left);
	}
	
	static boolean isSymmetric(TreeNode root) {
		if(root == null)
			return true;
		return symmetricUtil(root.left, root.right);
	}
}
