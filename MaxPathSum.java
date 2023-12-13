package trees;

public class MaxPathSum {
	static int maxPathSum(TreeNode root) {
		int[] maxValue = new int[1];
		maxValue[0] = Integer.MIN_VALUE;
		maxPathDown(root, maxValue);
		return maxValue[0];
	}
	
	static int maxPathDown(TreeNode root, int[] maxValue) {
		if(root == null)
			return 0;
		int left = maxPathDown(root.left, maxValue);
		int right = maxPathDown(root.right, maxValue);
		
		maxValue[0] = Math.max(maxValue[0], left + right + root.data);
		return Math.max(left, right) + root.data;
	}
}
