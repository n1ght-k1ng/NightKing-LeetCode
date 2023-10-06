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
    
    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        
        return (left.val == right.val) && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
    
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        // Call the helper function 'isSymmetric' with the left and right subtrees of the root.
        return isSymmetric(root.left, root.right);
    }
}
        
        
        
//         Queue <TreeNode> queue = new LinkedList<>();
//         queue.offer(root);
        
//         while(!queue.isEmpty()){
//             int levsize = queue.size();
//             for(int i = 0 ; i < levsize ; i++){
                
//             }
//         }
        
