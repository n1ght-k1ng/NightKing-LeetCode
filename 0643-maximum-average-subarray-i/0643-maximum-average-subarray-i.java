class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum = 0;
        for(int i = 0 ; i < k; i++){
            sum += nums[i];
        }
        double max = sum;
        int i = 0 ;
        int j = k - 1;
        
        while(i <= j && j <= nums.length-1){
            max = Math.max(sum , max);
            sum = sum - nums[i];
            i++; j++;
            if(j < nums.length)
            sum = sum + nums[j];
        }
        return max/k;
        
    }
}