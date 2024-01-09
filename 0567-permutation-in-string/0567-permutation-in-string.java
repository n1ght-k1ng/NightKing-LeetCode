class Solution {
    
    public boolean compute(int st , int end , String s2 , HashMap<Character,Integer> m){
        HashMap<Character, Integer> map = new HashMap<>(m); 
        for(int i = st ; i < end ; i++){
            char c = s2.charAt(i);
            if(map.containsKey(c)){
                map.put(c , map.get(c) -1);
            
            if(map.get(c) == 0){
                map.remove(c);
            }
            }
        }
        return map.isEmpty();
        
    }
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c , map.getOrDefault(c,0) +1);
        }
        
        int check = s1.length();
        for(int i = 0 ; i <= s2.length() - check ; i++){
            boolean res = compute(i , i+ check , s2 , map);
            if(res == true){
                return true;
            }
        }
        return false;
    }
}