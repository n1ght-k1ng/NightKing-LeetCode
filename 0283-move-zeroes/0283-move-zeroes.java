class Solution {
    public void moveZeroes(int[] nums) {
        int count =0;
        // for(int i = 0 ; i< nums.length ; i++){
        //     if(nums[i] == 0)
        //         count++;
        // }
        // while(count > 0){
        // for(int i =0; i< nums.length -1; i++){
        //     if(nums[i] == 0){
        //         nums[i] = nums[i+1];
        //         nums[i+1] = 0;
        //     }
        // }
        //     count--;
        // }
        
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
}