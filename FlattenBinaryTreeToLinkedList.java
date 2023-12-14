package trees;

public class FlattenBinaryTreeToLinkedList {
	static void Flatten(TreeNode root) {
		TreeNode curr = root;
		
		while(curr != null) {
			// reach to the rightmost child of left subtree of curr
			
			if(curr.left != null) {
				TreeNode prev = curr.left;
				while(prev.right != null) {
					prev = prev.right;
				}
				
				// now prev is at the rightmost child of curr's left subtree.
				// Now prev.right should point to curr.right
				prev.right = curr.right;
				// now ideally the left subtree of curr/root should be linked by right pointer
				curr.right = curr.left;
				
				curr.left = null;
			}
			curr = curr.right;
		}
	}
}
