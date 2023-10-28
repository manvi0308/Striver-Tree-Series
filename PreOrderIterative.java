import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class PreOrderIterative {
    static ArrayList<Integer> preOrder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode topNode = stack.peek();
            res.add(topNode.val);
            stack.pop();
            if (topNode.right != null)
                stack.push(topNode.right);
            if (topNode.left != null)
                stack.push(topNode.left);
        }
        return res;
    }
}