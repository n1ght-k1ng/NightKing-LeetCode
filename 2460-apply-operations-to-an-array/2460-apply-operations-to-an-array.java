class Solution {
    private void shiftZero(int[] nums){
        int left = 0;
        for(int i =0 ; i<nums.length; i++){
            if(nums[i]!=0){
                nums[left] = nums[i];
                left++;
            }
        }
        
        for(int i = left ; i<nums.length ; i++){
            nums[i] = 0;
        }
    }
    
    public int[] applyOperations(int[] nums) {
        
        for(int i = 0; i< nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] =0;
            }
        }
        
        shiftZero(nums);
        return nums;
        
    }
}