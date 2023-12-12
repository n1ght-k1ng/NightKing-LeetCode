class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        
        int s1  = nums[nums.length-1];
        int s2 = nums[nums.length - 2];
        
        return((s1-1)*(s2-1));
    }
}