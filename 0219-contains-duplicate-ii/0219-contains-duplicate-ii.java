class Solution 
{
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        Map<Integer, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            int num = nums[i];
            if (lastIndexMap.containsKey(num) && i - lastIndexMap.get(num) <= k) 
            {
                return true;
            }
            lastIndexMap.put(num, i);
        }
        return false;
    }
}


// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         HashMap<Integer, List<Integer>> map = new HashMap<>();
        
//         for(int i = 0 ; i< nums.length ; i++){
//             if(map.containsKey(nums[i])){
//                 List<Integer> arr = map.get(nums[i]);
//                 arr.add(i);
//                 map.put(nums[i],arr);
//             }
//             if(map.containsKey(nums[i]) == false){
//                 List<Integer> new1 = new ArrayList();new1.add(i);
//                 map.put(nums[i],new1);
//             }
//         }
        
//         for (int key : map.keySet()) {
//             List<Integer> arr = map.get(key);
//             if(arr.size() ==1)
//                 continue;
//             else{
//                 int p1 = 0;
//                 int p2 = 1;
//                 for(int i =0 ; i< arr.size()-1 ; i++){
//                     if(arr.get(p2) - arr.get(p1) <=k){
//                         return true;
//                     }
//                     p1 +=1;
//                     p2+=1;
//                 }
//             }
//         }
//         return false;
//     }
// }