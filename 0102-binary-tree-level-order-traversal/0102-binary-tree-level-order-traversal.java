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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue <TreeNode> queue = new LinkedList();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levsize = queue.size();
            List<Integer> levres= new ArrayList<>(levsize);
            
            for(int i = 0 ; i<levsize; i++){
                TreeNode curr = queue.poll();
                levres.add(curr.val);
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
                
            }
            res.add(levres);
            
        
        }
        return res;
    }
}