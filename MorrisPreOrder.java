package trees;

import java.util.ArrayList;

public class MorrisPreOrder {
	static ArrayList<Integer> morrisInOrder(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();

		TreeNode curr = root;

		while (curr != null) {

			if (curr.left == null) {
				res.add(curr.data);
				curr = curr.right;
			}

			else {
				TreeNode prev = curr.left;

				while (prev.right != null && prev.right != curr) {
					prev = prev.right;
				}

				if (prev.right == null) {
					prev.right = curr;
					// diff here
					res.add(curr.data);
					curr = curr.left;
				}

				else {
					prev.right = null;
					curr = curr.right;
				}
			}
		}
		return res;
	}
}
