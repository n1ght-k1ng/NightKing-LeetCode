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
    public List inorderTraversal(TreeNode root) {
         List res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode node= root;
        while(true){
            if(node!=null){
                s.add(node);
                node = node.left;
            }
            else{
                if(s.empty()){
                    break;
                }
                node= s.pop();
                res.add(node.val);
                node=node.right;
            }
        }
        return res;
    }
    
    
}


