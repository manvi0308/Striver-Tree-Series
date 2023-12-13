package trees;

import java.util.ArrayList;
import java.util.List;

public class LeftView {
	static List<Integer> leftView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		leftViewUtil(root, res, 0);
		return res;
	}
	
	static void leftViewUtil(TreeNode root, List<Integer> res, int level) {
		if (root == null)
			return;

		if (level == res.size()) {
			res.add(root.data);
		}

		leftViewUtil(root.left, res, level + 1);
		leftViewUtil(root.right, res, level - 1);
	}

}
