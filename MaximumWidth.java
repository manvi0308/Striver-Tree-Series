package trees;

import java.util.*;

class NodeIndex {
	TreeNode node;
	int index;

	NodeIndex(TreeNode node, int index) {
		this.node = node;
		this.index = index;
	}
}
public class MaximumWidth {
	
		static int maxWidth(TreeNode root) {
			if (root == null)
				return 0;
			int ans = 0;
			Queue<NodeIndex> q = new LinkedList<>();
			q.offer(new NodeIndex(root, 0));

			while (!q.isEmpty()) {
				int size = q.size();
				int mmin = q.peek().index;
				int first = 0, last = 0;
				for (int i = 0; i < size; i++) {
					int curIndex = q.peek().index - mmin;
					TreeNode node = q.peek().node;
					q.poll();

					if (i == 0)
						first = curIndex;
					if (i == size - 1)
						last = curIndex;

					if (node.left != null)
						q.offer(new NodeIndex(node.left, 2 * curIndex + 1));
					if (node.right != null)
						q.offer(new NodeIndex(node.right, 2 * curIndex + 2));

				}

				ans = Math.max(ans, last - first + 1);
			}
			return ans;
		}
	}

