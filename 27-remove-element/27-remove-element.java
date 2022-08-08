class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i =0; int j = 0 ;
        while(i<nums.length)
        {
            if(val != nums[i])
            {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j ;
    }
}