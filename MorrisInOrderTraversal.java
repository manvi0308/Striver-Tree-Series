package trees;
import java.util.*;
public class MorrisInOrderTraversal {
		static ArrayList<Integer> morrisInOrder(TreeNode root){
			ArrayList<Integer> res = new ArrayList<Integer>();
			
			TreeNode curr = root;
			
			while(curr != null)
			{
				/*
				 * First case will be when there is no left subtree, so as per inorder
				 * left root right, we have to add root to res and then move to right subtree
				 */
				
				if(curr.left == null) {
					res.add(curr.data);
					curr = curr.right; // moving to right subtree
				}
				
				// now if left subtree exists so we have to reach to the rightmost node of left subtree and
				// create a thread/pointer from that node to curr
				else {
					TreeNode prev = curr.left;
					// reach to rightmost node of the root' left subtree, the left subtree's root is prev
					
					while(prev.right != null && prev.right != curr) {
						prev = prev.right;
					}
					
					// now prev is at the rightmost node of left subtree 
					
					// creating a thread/pointer from prev to curr and moving curr a step ahead 
					if(prev.right == null) {
						prev.right = curr;
					    curr = curr.left;
					}
					
					// means we have reached a case where prev.right is pointing to a node not Null, so means we 
					// have entirely visited left subtree, print curr now and move to right subtree
					
					else {
						// breaking thread
	                    prev.right = null; 
	                    // adding curr to res
	                    res.add(curr.data); 
	                    // moving curr to right subtree
	                    curr = curr.right; 
	                }
				}
			}
			return res;
		}
}
