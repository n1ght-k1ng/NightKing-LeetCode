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
    public boolean isValidBST(TreeNode root) {
    return isValidBST(root, null, null);
}

private boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
    if (node == null) {
        return true;
    }
    int val = node.val;
    if ((lower != null && val <= lower) || (upper != null && val >= upper)) {
        return false;
    }
    return isValidBST(node.left, lower, val) && isValidBST(node.right, val, upper);
}
}
//     public boolean isValidBST(TreeNode root) {
//         if(root == null || root.left == null || root.right == null){
//             return true;
//         }        
//         if(root.left.val == root.val || root.right.val == root.val){
//             return false;
//         }
//         boolean left = true; boolean right = false;
//         if(root.left.val < root.val){
//             left = isValidBST(root.left);
//         }else{
//             return false;
//         }
//         if(root.right.val > root.val){
//             right = isValidBST(root.left);
//         }else{
//             return false;
//         }

        
//         return left && right;
        
        
    
        
//     }
