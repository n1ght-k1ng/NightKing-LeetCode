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
    int maxlev = -1;
    public int deepestLeavesSum(TreeNode root) {
        helper(root ,0);
        return sum;
    }
    
    public void helper(TreeNode node , int lev){
        if(node == null){
            return;
        }
        if(lev > maxlev){
            maxlev = lev;
            sum =0;
        }
        if(node.left == null && node.right == null && lev == maxlev){
            sum+=node.val;
            System.out.println(node.val+" ");
            return;
        }
        helper(node.left, lev+1);
        helper(node.right, lev+1);
    }
}