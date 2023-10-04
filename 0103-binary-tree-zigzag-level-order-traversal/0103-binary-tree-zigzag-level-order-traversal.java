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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        boolean left = true;
        while(!queue.isEmpty()){
            int levsize = queue.size();
            List<Integer> levres = new ArrayList<>(); 
            Stack<Integer> rt = new Stack<Integer>();
            if(left == true){
                for(int i = 0; i < levsize ; i++){
                    TreeNode curr = queue.poll();
                    levres.add(curr.val);
                    if(curr.left != null){
                        queue.offer(curr.left);
                    }
                    if(curr.right != null){
                        queue.offer(curr.right);
                    }

                }
                left = false;
            }else{
                for(int i = 0 ;i<levsize ; i++)
                {
                    TreeNode curr = queue.poll();
                    rt.push(curr.val);
                    if(curr.left != null){
                        queue.offer(curr.left);
                    }
                    if(curr.right != null){
                        queue.offer(curr.right);
                    }
                    
                }
                
                while(!rt.isEmpty()){
                    levres.add(rt.pop());
                }
                left = true;
            }
            
            res.add(levres); 
        }
        
        return res;
    }
}