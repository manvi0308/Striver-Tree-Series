package trees;
import java.util.*;
class Pair{
	TreeNode node;
	int vertical;
	Pair(int vertical, TreeNode node){
		this.node = node;
		this.vertical = vertical;
	}
}
public class TopView {
	static List<Integer> topView(TreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.add(new Pair(0, root));
		HashMap<Integer, Integer> map = new HashMap<>();
		
		while(!queue.isEmpty()) {
			Pair pair = queue.remove();
			TreeNode node = pair.node;
			int vertical = pair.vertical;
			
			if(map.get(vertical) == null) {
				map.put(vertical, node.data);
			}
			
			if(node.left != null) {
				queue.add(new Pair(vertical - 1, node.left));
			}
			
			if(node.right != null) {
				//node = node.right;
				queue.add(new Pair(vertical + 1, node.right));
			}
		}
		
		for(Map.Entry<Integer, Integer> it : map.entrySet()) {
			res.add(it.getValue());
		}
		return res;
	}
}
