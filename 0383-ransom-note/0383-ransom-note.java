class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransom = new HashMap();
        boolean flag = true;   
        for(int i= 0;i<ransomNote.length() ; i++){
            char ch = ransomNote.charAt(i);
            if (ransom.containsKey(ch)) {
                int curr = ransom.get(ch);
                ransom.put(ch,curr+1);
            }else{
                ransom.put(ch,1);
            }
            
        }
        for(int i = 0 ; i < magazine.length() ; i++){
            char ch = magazine.charAt(i);
            if(ransom.containsKey(ch)){
                int curr = ransom.get(ch);
                ransom.put(ch, curr-1);
            }
        }
        
    for (Map.Entry<Character, Integer> entry : ransom.entrySet()) {
    int value = entry.getValue();
    if(value > 0){
        flag = false;
    }
}
        return flag;
            
        
    }
}