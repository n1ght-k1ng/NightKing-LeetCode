/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public String tree2str(TreeNode root) {
        return helper(root);
    }

    private String helper(TreeNode node) {
        if (node == null) {
            return "";
        }

        String result = String.valueOf(node.val);

        if (node.left != null || node.right != null) {
            result += "(" + helper(node.left) + ")";
        }

        if (node.right != null) {
            result += "(" + helper(node.right) + ")";
        }

        return result;
    }
}

