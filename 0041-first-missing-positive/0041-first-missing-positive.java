class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer , Boolean> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],true);
            }
            }
        }
        int start = 1;
        while(true){
            if(map.containsKey(start))
                start++;
            else
                break;
        }        
        
        return start;
    }
}