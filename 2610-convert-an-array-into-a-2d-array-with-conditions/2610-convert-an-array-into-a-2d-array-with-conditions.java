class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
     
        HashMap<Integer , Integer> map = new HashMap<>();
        Set < Integer> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        
        int count = 0;
        while(count < nums.length){
            List<Integer> res = new ArrayList<>();
        for(int i = 0 ; i< nums.length ; i++){
            if(res.contains(nums[i]))
                continue;
            if(nums[i] != 0){
            res.add(nums[i]);
            count++;
            nums[i] = 0;
            }
            
        }
            result.add(res);
        }
        return result;
        
    }
}