package trees;
import java.util.*;
public class PathFromRootToNode {
	static boolean getPath(TreeNode root, ArrayList<Integer> res, int X) {
		if(root == null)
			return false;
		res.add(root.data);
		
		if(root.data == X)
			return true;
		
		if(getPath(root.left, res, X) || getPath(root.right, res, X))
			return true;
		
		res.remove(res.size() - 1);
		return false;
	}
}
