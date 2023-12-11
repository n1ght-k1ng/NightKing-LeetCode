class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int occ = (int)(arr.length*0.25);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i], val+1);
                if(map.get(arr[i]) > occ)
                    return arr[i];
            }
            else{
                map.put(arr[i],1);
            }
        }
        return 0;
        
    }
}