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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        // if(root == null){
        // if(sum == targetSum){
        //     return true;
        // }
        //     return false;
        // }
        if (root == null) {
            return false;
        }
        
        sum = sum + root.val;
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                return true;
            }
            else{
                sum = sum - root.val;
                return false;
            }
        }
        
        
        
        boolean haspathleft = hasPathSum(root.left , targetSum);
        boolean haspathright = hasPathSum(root.right , targetSum);
        
        if(haspathleft == true || haspathright == true){
            return true;
        }
        
        else{
            sum = sum - root.val;
            return false;
        }
        

        
            
        
    }
    
}