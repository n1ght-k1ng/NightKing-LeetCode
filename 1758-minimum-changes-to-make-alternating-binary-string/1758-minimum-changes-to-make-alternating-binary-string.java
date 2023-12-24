class Solution {
    public int minOperations(String s) {
        String com1 = "";
        String com2 = "";
        int len = s.length();
        for(int i = 0 ; i< len/2 ; i++){
        com1 += "10";
        com2 += "01";
    }
        
        if(len % 2 == 1){
            com1 += "1";
            com2 += "0";
            
        }
        int c1 = 0;
 int c2 = 0;
        for(int i = 0; i < len ; i++){
            if(s.charAt(i) != com1.charAt(i)){
                c1++;
            }
            if(s.charAt(i) != com2.charAt(i)){
                c2++;
            }
            
        }
        
        return Math.min(c1,c2);
        
    }
}