class Solution {
    
    private String compute(char c , int x){
        String ret = "";
        for(int i = 0 ; i< x ; i++){
            ret += c;
        }
        return ret;
    }
    public String customSortString(String order, String s) {

        String ret = "";
        HashMap < Character , Integer > map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c , 0) + 1);
        }
        
        for(char c : order.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                String add = compute(c , map.get(c));
                ret = ret + add ;
                map.put(c ,0);
            }
        }
        
        for(char c : s.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0){
                ret = ret + c;
                map.put(c , map.get(c) -1);
            }
        }
        
        return ret;
        // for(i )
    }
}