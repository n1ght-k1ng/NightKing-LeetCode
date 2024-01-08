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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        helper(root , low , high );
        return sum;
    }
    
    public void helper(TreeNode node , int left , int right){
        if(node == null){
            return ;
        }
        if(node.val == left){
            sum+= node.val;
            helper(node.right,left , right);
        }
        if(node.val == right){
            sum+= node.val;
            helper(node.left , left ,right);
        }
        if(node.val > left && node.val < right){
            sum += node.val;
            helper(node.left , left , right);
            helper(node.right , left , right);
        }
        if(node.val < left){
            helper(node.right , left , right);
        }
        if(node.val > right){
            helper(node.left , left , right);
        }
    }
}