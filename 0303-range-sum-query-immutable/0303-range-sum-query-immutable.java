class NumArray {
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
   int sqrt = (int) Math.round(Math.sqrt(nums.length));
       int preprocess[] = new int[sqrt+1];
        int block_id = -1;
        
        if (sqrt == 1) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += nums[i];
            }
            return sum;
        }
        for(int i = 0; i < nums.length; i++){
            if(i % sqrt ==0){
                block_id++;
            }
            preprocess[block_id]+=nums[i];
        }
        int sum = 0;
        if(right-left < sqrt){
            for(int i = left ; i<=right ;i++){
                sum=sum+nums[i];
            }
            return sum;
        }
        if(left % sqrt !=0){
            while(left % sqrt != 0){
                sum += nums[left];
                left++;
            }  
        }else{
            sum += preprocess[left/sqrt];
            left+=sqrt;
        }
        
        while(left + sqrt <= right){
            sum+=preprocess[left/sqrt];
            left +=sqrt;
        }
        
        while(left <= right){
            sum = sum + nums[left];
            left++;
        }
        
        
        return sum;

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */