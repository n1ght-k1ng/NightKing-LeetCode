class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     List<Integer> res = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) +1);
                if(map.get(nums[i]) > 1){
                    res.add(nums[i]);
                }
            }
            else{
                map.put(nums[i] , 1);
            }
        }
        return res;
    }
}