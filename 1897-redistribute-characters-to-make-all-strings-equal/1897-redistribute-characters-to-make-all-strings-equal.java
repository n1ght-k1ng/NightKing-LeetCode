class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length == 1){
            return true;
        }
        HashMap<Character , Integer > map = new HashMap<>();
        for(String w : words){
            for(char c : w.toCharArray()){
                map.put(c, map.getOrDefault(c,0) + 1);
            }
        }
        
        Set<Integer> uniqueValues = new HashSet<>(map.values());
        for(int i : uniqueValues){
            if(i%words.length !=0){
                return false;
            }
        }
        return true;
        
    }
}