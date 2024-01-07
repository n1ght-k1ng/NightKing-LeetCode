class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int ones = 0;
        int zeros = 0; 
        int max = 0;
        int count = 0;
        int left = 0; int right = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1 && zeros == 0) {
                left++;
            } 
            if(nums[j] == 1 && zeros == 1){
                right++;
            }
            if (nums[j] == 0) {
                zeros++;
                count++;
            }
            if(zeros == 2){
                ones = left + right;
                max = Math.max(max , ones);
                left = right;
                right = 0;
                zeros--;
            }
            
    }
        ones = left + right;
        max = Math.max(max , ones);
        if(count == 1 || count ==0){
            return nums.length -1;
        }

        return max;
}}