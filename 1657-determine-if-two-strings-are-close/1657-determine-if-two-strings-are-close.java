class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        List<Character> ar1 = new ArrayList<>(map1.keySet());
        List<Character> ar2 = new ArrayList<>(map2.keySet());
        
        List<Integer> arr1 = new ArrayList<>(map1.values());
        List<Integer> arr2 = new ArrayList<>(map2.values());
        
        Collections.sort(arr1);
        Collections.sort(arr2);
        Collections.sort(ar1);
        Collections.sort(ar2);
        
        return arr1.equals(arr2) && ar1.equals(ar2);
        
    
    }
}