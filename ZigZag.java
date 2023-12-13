package trees;
import java.util.*;
public class ZigZag {
	static ArrayList<ArrayList<Integer>> zigZag(TreeNode root) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		boolean flag = true;
		
		
		while(!queue.isEmpty()) {
			int level = queue.size();
			ArrayList<Integer> temp = new ArrayList<Integer>(level);
			for(int i = 0; i < level; i++) {
				if(queue.peek().left != null) {
					queue.add(queue.peek().left);
				}
				
				if(queue.peek().right != null) {
					queue.add(queue.peek().right);
				}
				
				if(flag == true) {
					temp.add(queue.poll().data);
				}
				
				else {
					temp.add(0, queue.poll().data);
				}
			}
			
			flag = !flag;
			res.add(temp);
		}
		return res;

	}
	
}
