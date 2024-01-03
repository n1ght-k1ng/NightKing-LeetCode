class Solution {
    public int removeDuplicates(int[] nums) {
        
        int occ = 1;
        int count = 0;
        int prev = nums[0];
        for(int i = 1 ; i < nums.length ;i++){
            if(nums[i] == prev)
                occ++;
            else{
                prev = nums[i];
                occ = 1;
            }
            if(occ > 2){
                prev = nums[i];
                nums[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length - count;
        
        
    }
}