class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        if(t.equals("")){
            return false;
        }
        if(s.charAt(0) != t.charAt(0)){
            return isSubsequence(s,t.substring(1,t.length()));
        }else{
            return isSubsequence(s.substring(1,s.length()),t.substring(1,t.length()));
        }

    }
}