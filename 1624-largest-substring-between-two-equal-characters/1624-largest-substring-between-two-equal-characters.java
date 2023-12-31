class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        HashMap<Character,List<Integer>> map = new HashMap<>();
        for(int i = 0 ; i  < s.length() ; i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c , new ArrayList<Integer>());
                map.get(c).add(1);
                map.get(c).add(i);
                map.get(c).add(0);
                continue;
            }
            map.get(c).set(0 , map.get(c).get(0) +1);  
            map.get(c).set(2, i - map.get(c).get(1));
        }
        
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(map.get(c).get(0) > 1){
                max = Math.max(max , map.get(c).get(2)-1);
            }
        }
        return max;
                    
                           
  }}