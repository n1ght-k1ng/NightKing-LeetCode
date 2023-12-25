class Solution {
    public long[] getDistances(int[] arr) {
        
        long res[] = new long[arr.length];
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        for(int i = 0; i< arr.length ;i++){
            if(!map.containsKey(arr[i]))
                map.put(arr[i], new ArrayList<Integer>());
            map.get(arr[i]).add(i);
        }
        
        for(List<Integer> indices : map.values()){
            
            long sum = 0;
            for(int e : indices){
                sum+=e;
            }
            
            long prefix = 0;
            int size = indices.size();
            /* If indices are A B C D E F , to calculate D 
                (D-A) + (D-B) + (D-C) + (E-D) + (F-D) -> 3 * D - (A + B + C) - 2 * D * (E + F)*/
            
            for (long i = 0 ; i < size ; i++){
                int index = indices.get((int) i);
                
                res[index] = (index*i - prefix) + (sum - prefix - index) - (size - i -1 )*index;
                prefix+= index;
            }
            
            
        }
        
        return res;
        
        
        
        
    }
}