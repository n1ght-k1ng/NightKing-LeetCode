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
class Solution {
    // int maxDepth =0 ;
    public int maxDepth(TreeNode root) {
        int d = height(root);
        return d;
    }
    
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int lefth = height(node.left);
        int righth = height(node.right);
        
        
        
        return Math.max(lefth , righth) + 1;
    }
}