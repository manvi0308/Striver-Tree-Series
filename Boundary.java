package trees;
import java.util.*;
public class Boundary {
	static boolean isLeaf(TreeNode root) {
		if(root.left == null && root.right == null)
			return true;
		return false;
	}
	
	static void leftBoundary(TreeNode root, ArrayList<Integer> res) {
		TreeNode ptr = root;
		while(ptr != null) {
			if(!isLeaf(ptr))
				res.add(ptr.data);
			if(ptr.left != null)
				ptr = ptr.left;
			else
				ptr = ptr.right;
		}
	}
	
	static void rightBoundary(TreeNode root, ArrayList<Integer> res) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		TreeNode ptr = root.right; // because root is already taken care of in initial configuration
		while(ptr != null) {
			if(!isLeaf(ptr)) {
				temp.add(ptr.data);
			}
			
			if(ptr.right != null)
				ptr = ptr.right;
			else
				ptr = ptr.left;
		}
		// in final res, it should be added in reverse order
		for(int i = temp.size() - 1; i >= 0; i--) {
			res.add(temp.get(i));
		}
		
	}

	static void addLeaves(TreeNode root, ArrayList<Integer> res) {
		// analogous to pre order traversal of tree
		if(isLeaf(root)) {
			res.add(root.data);
		}
		if(root.left != null)
			addLeaves(root.left, res);
		if(root.right != null)
		addLeaves(root.right, res);
	}
	static ArrayList<Integer> boundaryTraversal(TreeNode root){
		ArrayList<Integer> res= new ArrayList<Integer>();
		if(!isLeaf(root)) {
			res.add(root.data);
		}
		leftBoundary(root, res);
		return res;
	}
}
