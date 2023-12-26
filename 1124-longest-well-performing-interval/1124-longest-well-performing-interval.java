class Solution {
    public int longestWPI(int[] hours) {
        HashMap<Integer,Integer> helper = new HashMap<Integer,Integer>();
        int sum = 0,ans=0;
        for(int i = 0;i<hours.length;i++){
            sum+=(hours[i]>8)?1:-1;
            if(sum>0){
                ans = i+1;
            }else if(helper.containsKey(sum-1)){
                ans = Math.max(ans,i-helper.get(sum-1));
            }
            if(!helper.containsKey(sum)){
                helper.put(sum,i);
            }
        }
        return ans;
    }
}


// class Solution {
//     public int longestWPI(int[] hours) {
        
//         int nonTD = 0;
//         int max = 0;
//         int TD = 0;
//         int permNTD = 0;
//         boolean contains = false;
//         for(int i =0 ; i< hours.length ; i++){
//             if(hours[i] > 8){
//                 TD++;
//                 permNTD++;
//                 contains = true;
//             }
//             else{
//                 nonTD++;
//                 permNTD--;
//             }
//             int wd = TD + nonTD;
//             if(permNTD > 0){
//                 max = Math.max(max,wd);
//             }
//             if(TD == nonTD && TD !=1){
//                 max = Math.max(max , TD +1);
//             }
            
            
//         }
//         if(max ==0 && contains == true){
//             return 1;
//         }
//         return max;
        
        
        
//     }
// }