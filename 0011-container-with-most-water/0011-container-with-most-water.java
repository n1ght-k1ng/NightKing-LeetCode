class Solution {
    public int maxArea(int[] height) {
        int i = 0 ; 
        int j = height.length -1;
        int max = 0;
        while(i < j){
            max = Math.max(max , Math.min(height[i] , height[j]) * (j - i));
            if(height[i] < height[j]) i++;
            else if(height[i] > height[j]) j--;
            else {
                i++; j--;
            }
        }
     
        
        return max;
    }
}
// class Solution {
//     public int maxArea(int[] a) {
        
//         int l = 0;
//         int r = a.length -1;
//         int pr = Integer.MIN_VALUE;
        
        
//         while(r>=l)
//         {   
//             if((Math.min(a[l],a[r])*(r-l)) > pr )
//             {
//               pr = Math.min(a[l],a[r])*(r-l);
            
                
//             }
//             if(a[l] < a[r]) l++;
//             else if(a[l] > a[r]) r--;
//         else {
//                 l++;
//                     r--;
//                 }
         
            
//         }

        
//      return pr;
        
//     }
// }