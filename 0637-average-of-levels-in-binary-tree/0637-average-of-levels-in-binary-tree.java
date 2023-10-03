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
    public List<Double> averageOfLevels(TreeNode root) {

        
        List<Double> res = new ArrayList<>();
                if(root == null){
            return res;
        }
        Queue <TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levsize = queue.size();
            double levAvg = 0.0;
            
            for(int i = 0 ; i < levsize ; i++){
                TreeNode curr = queue.poll();
                levAvg = levAvg + curr.val;
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
           
            }
            levAvg = levAvg / levsize ;
            res.add(levAvg);
        }
        return res;
    }
}