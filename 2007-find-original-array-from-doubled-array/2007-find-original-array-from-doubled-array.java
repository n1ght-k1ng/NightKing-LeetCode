// class Solution {
//     public int[] findOriginalArray(int[] changed) {
        
//         if(changed.length % 2 == 1){
//             return new int[0];
//         }
//         List<Integer> arr = new ArrayList<>();
//         List<Integer> cont = new ArrayList<>();
//         int n = changed.length;
//         int zeroes = 0;
//         for(int i : changed){
//             if(i == 0){
//                 zeroes++;
//                 continue;
//             }
//             cont.add(i);
//         }
//         if(zeroes % 2 ==1){
//             return new int[0];
//         }
//         int i=1;
//         while(i <= zeroes/2){
//             arr.add(0);
//             i++;
//         }
        
//         Arrays.sort(changed);
//         for(i = 0 ; i < n; i++){
//             if(cont.contains(changed[i]) && cont.contains(changed[i]*2)){
//                 arr.add(changed[i]);
//                 cont.remove(Integer.valueOf(changed[i]));
//                 cont.remove(Integer.valueOf(changed[i]*2));
//             }
//         }
        
//         if(arr.size() != n/2){
//             return new int[0];
//         }
        
        
//         int a [] = new int [arr.size()];
//         for( i = 0 ; i < arr.size() ; i++)
//         a[i] = arr.get(i);
        
//         return a ;
// }} -- TLE

class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        int len = changed.length;
        if((len&1) != 0) return new int[0];

        Arrays.sort(changed);
        

        Map<Integer,Integer> map = new HashMap<>();
        for(int e : changed) map.put(e,map.getOrDefault(e,0)+1);
        
        int[] res = new int[len/2];
        int k = 0;
        for(int i=0; i<len; i++){
            int ele = changed[i];
            

            if(map.containsKey(ele)){
                

                if(map.containsKey(ele*2)){
                    res[k++] = ele;
                    

                    map.put(ele,map.get(ele)-1);
                    map.put(ele*2,map.get(ele*2)-1);

                    if(map.get(ele)<=0) map.remove(ele);
                    if(map.containsKey(ele*2) && map.get(ele*2)<=0) map.remove(ele*2);
                }
                else return new int[0];
            }
            
        }
        return res;
    }
}