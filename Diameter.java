package trees;
class TreeNode{
	int data;
	TreeNode left, right;
	
	TreeNode(int data){
		this.data = data;
		left = right = null;
	}
}
public class Diameter {
	static int diameter(TreeNode root) {
		int[] diameter = new int[1];
		height(root, diameter);
		return diameter[0];
	}
	
	static int height(TreeNode root, int[] diameter) {
		if(root == null)
			return 0;
		int lh = height(root.left, diameter);
		int rh = height(root.right, diameter);
		diameter[0] = Math.max(diameter[0], lh + rh);
		
		return 1 + Math.max(lh ,rh);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(diameter(root));
	}

}
