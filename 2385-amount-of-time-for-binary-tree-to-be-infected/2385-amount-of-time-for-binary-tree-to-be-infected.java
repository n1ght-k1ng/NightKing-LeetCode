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
	int ans;
	public int amountOfTime(TreeNode root, int start) {
		ans = 0;
		helper(root, start);

		return ans;
	}

	private int[] helper(TreeNode root, int start){
		if(root == null)
			return new int[]{0, 0};
		//arr -> [0]
		//0 -> means infected node is not in that subtree 
		//1 -> means infected node in that subtree

		//if arr[0] == 0, then arr[1] -> height of subtree

		//if 1 in arr[0] then arr[1] -> stores minutes needed to infect the root
		//and time to infect the other subtree is height of that subtree + time to infect root


		int[] left = helper(root.left, start);
		int[] right = helper(root.right, start);

		int h = Math.max(left[1], right[1]);

		if(left[0] == 1){//left has infected node -> left[1] -> gives time to infect root
			ans = Math.max(ans, left[1] + right[1]);
			left[1] += 1;
			return left;
		}else if(right[0] == 1){//right has infected node
			ans = Math.max(ans, left[1] + right[1]);
			right[1] += 1;
			return right;
		}

		//if root is infected then time needed to infect the subtrees is max height of subtrees
		if(root.val == start){
			ans = Math.max(h, ans);
			return new int[]{1, 1};
		}

		left[1] = h + 1;//for simple height
		return left;
	}
}