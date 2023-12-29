class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        int z = 0;
        for(int i : arr){
            if(i == 0){
                z++;
                continue;
            }
            map.put(i , map.getOrDefault(i,0) + 1);
        }
        int count = z/2;
        for(int i = 0 ; i < arr.length; i++){
            int ele = arr[i];
            // if(ele == 0){
            //     continue;
            // }
            if(map.containsKey(ele)){
                if(map.containsKey(ele*2)){
                    if(map.get(ele) > 0 && map.get(ele*2) > 0 ){
                        count++;
                        map.put(ele , map.get(ele) -1);
                        map.put(ele*2 , map.get(ele*2) - 1);
                }
            }
        }
    }
        if(count >= arr.length/2){
            return true;
        }else{
            return false;
        }
}
}