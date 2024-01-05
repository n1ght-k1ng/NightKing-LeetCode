class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int curr = 0;
            for(int j = i ; j < nums.length ;j++){
                curr += nums[j];
                list.add(curr);
            }
        }
        
        Collections.sort(list);
        int res=0,mod=1000000007;
        for(int i = left-1 ; i < right ; i++){
            res = (res+list.get(i))% mod; 
        }
        
        return res;
        
        
    }
}