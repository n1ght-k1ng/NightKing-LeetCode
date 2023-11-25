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
    int finalsum = 0; 
    
    public int sumNumbers(TreeNode root) {
        helper(root ,"" ); 
        return finalsum;
    }
    
    void helper(TreeNode node , String sum){
        if(node == null){
            return;
        }
        sum = sum + String.valueOf(node.val);
        if(node.left == null && node.right == null){
            
            finalsum = finalsum + Integer.valueOf(sum);
            return;
        }
        
        helper(node.left , sum);
        helper(node.right , sum);
    }
}