class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String >> res =new ArrayList<>();
        
        for(int i = 0 ; i < strs.length ; i++){
            
            char word [] = strs[i].toCharArray();
            Arrays.sort(word);
            String w = String.valueOf(word);
            
            if(!map.containsKey(w))
                map.put(w, new ArrayList<>());
            
            map.get(w).add(strs[i]);
            
        }
        
        res.addAll(map.values());
        return res;
    }
}