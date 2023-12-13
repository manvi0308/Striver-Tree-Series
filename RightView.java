package trees;
import java.util.*;
public class RightView {
	static List<Integer> rightView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		rightViewUtil(root, res, 0);
		return res;
	}
	
	static void rightViewUtil(TreeNode root, List<Integer> res, int level) {
		if (root == null)
			return;

		if (level == res.size()) {
			res.add(root.data);
		}

		rightViewUtil(root.right, res, level + 1);
		rightViewUtil(root.left, res, level - 1);
	}
}
