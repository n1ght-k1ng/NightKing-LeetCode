class Solution {
    public int[] twoSum(int[] nums, int target) {
        
            
//             int j = nums.length -1;
//             int [] store = new int [2];
//             int i =0;
//             while(i < j)
//             {
                
//                 if((nums[i] + nums[j]) > target) 
//                     j--;
//                 else if ((nums[i] + nums[j]) < target)
//                     i++;
                
                
                
//                 else if((nums[i] + nums[j]) == target)
//                 {
//                     store[0] = i;
//                     store[1]=j;
//                     break;
//                     }
//             }
        
//         return store ; 
        
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            m.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if(m.containsKey(diff) && m.get(diff) != i) {
                return new int[] {i, m.get(diff)};
            }
        }
        
        return null;
    }
        
    }
