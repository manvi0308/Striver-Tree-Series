/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start

import java.util.Queue;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if(root == null)
            return ans;
        
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> nodes = new ArrayList<Integer>();
            for(int i = 0; i < count; i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }

                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }

                nodes.add(queue.remove().val);
            }

            ans.add(nodes);
        }
    }

}
// @lc code=end
