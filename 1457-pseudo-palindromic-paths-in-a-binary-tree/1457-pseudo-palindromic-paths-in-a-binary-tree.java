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
 **/
 class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] arr = new int[10];
        return solve(root, arr);
    }

    int solve(TreeNode root, int[] arr) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            arr[root.val]++;
            int odd = 0;
            for (int i : arr) {
                if (i % 2 != 0)
                    odd++;
            }
            int local =  odd <= 1 ? 1 : 0;
            arr[root.val]--;
            return local;
        }
        arr[root.val]++;
        int ans = solve(root.left, arr) + solve(root.right, arr);
        arr[root.val]--;
        return ans;
    }
 }
