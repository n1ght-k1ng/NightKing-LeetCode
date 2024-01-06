// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int prefix[] = new int[nums.length];
        
        
//         int ones = k;
//         int i = 0;
//         int sum =0;
//         int max = 0;
//         while(i < nums.length){
            
//             if(nums[i] == 1){
//                 sum =1; 
//             }
//             if(nums[i] == 0){
//                 sum = 0;
//                 ones = k -1;
//             }
//             int j = i +1;
//             int ind = -1;
//             while(j < nums.length && ones >= 0){
//                 if(nums[i] == 0 && ind == -1){
//                     ind = i;
//                 }  
//                 if(nums[i] == 1){
//                     sum++;
//                 }
//                 else{
//                     ones--;
//                     sum++;
//                 }
//                 j++;
//             }
//             max = Math.max(sum , max);
//             if(ind != -1)
//                 i = ind;
//             else
//                 i++;
            
//         }
//         return max;
//     }
// }
class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int ones = 0; // Count of ones in the current subarray
        int zeros = 0; // Count of zeros in the current subarray
        int max = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 1) {
                ones++;
            } else if (nums[j] == 0) {
                zeros++;
            }

            // Adjust the window
            while (zeros > k) {
                if (nums[i] == 0) {
                    zeros--;
                }
                i++;
            }

            // Update the maximum length
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}