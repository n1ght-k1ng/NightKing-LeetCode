class Solution {
    static int compute(List<Integer> ans, int key) {
        int low = 0;
        int high = ans.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ans.get(mid) == key) return mid;
            else if (ans.get(mid) < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high + 1;
    }
                    
    public int lengthOfLIS(int[] nums) {
        
        List < Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int count = 1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] > list.get(list.size() - 1)){
                list.add(nums[i]);
                count++;
            }
            else{
                int ind = compute(list , nums[i]);
                list.set(ind , nums[i]);
            }
        }
        return count ;
    }
}