package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BottomView {
	static List<Integer> bottomView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.add(new Pair(0, root));
		HashMap<Integer, Integer> map = new HashMap<>();

		while (!queue.isEmpty()) {
			Pair pair = queue.remove();
			TreeNode node = pair.node;
			int vertical = pair.vertical;

			map.put(vertical, node.data);

			if (node.left != null) {
				queue.add(new Pair(vertical - 1, node.left));
			}

			if (node.right != null) {
				// node = node.right;
				queue.add(new Pair(vertical + 1, node.right));
			}
		}

		for (Map.Entry<Integer, Integer> it : map.entrySet()) {
			res.add(it.getValue());
		}
		return res;
	}
}
