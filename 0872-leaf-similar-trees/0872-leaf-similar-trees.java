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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> tree1 = new ArrayList<>();
    List<Integer> tree2 = new ArrayList<>();
        // System.out.println(helper(root1 , tree1));
        // System.out.println(helper(root2 , tree2));
        return (helper(root1 , tree1)).equals(helper(root2 , tree2)) ;
    }
    
    public List<Integer> helper(TreeNode node , List<Integer> res){
        if(node == null){
            return res;
        }
        if(node.left == null && node.right == null){
            res.add(node.val);
            return res;
        }
        
        res= helper(node.left , res);
        res = helper(node.right , res);
        
        return res;
    }
}