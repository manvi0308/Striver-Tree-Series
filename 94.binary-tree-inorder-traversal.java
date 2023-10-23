/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Left Root Right
        List<Integer> res = new ArrayList<Integer>();
        inOrderRecursive(root, res);
        return res;
    }

    public void inOrderRecursive(TreeNode root, List<Integer> res) {
        if(root == null)
        return;

        inOrderRecursive(root.left, res);
        res.add(root.val);
        inOrderRecursive(root.right, res);
    }
}

// @lc code=end
