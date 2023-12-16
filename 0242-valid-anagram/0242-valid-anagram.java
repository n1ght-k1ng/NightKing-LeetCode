class Solution {
    public boolean isAnagram(String s, String t) {
        char w1[] = s.toCharArray();
        char w2[] = t.toCharArray();
        
        Arrays.sort(w1);
        Arrays.sort(w2);
        
        String c1 = String.valueOf(w1);
        String c2 = String.valueOf(w2);
        
        if(c1.equals(c2)){
            return true;
        }
        else{
            return false;
        }
    }
}