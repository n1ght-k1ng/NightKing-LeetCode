class Solution {
    public String largestGoodInteger(String num) {
        String good[] = {"000" , "111" , "222" , "333" , "444" , "555" ,"666" , "777" , "888" , "999"};
        
        String ans = "-1";
        for(int i = 0 ; i <= num.length()-3 ; i++){
            String temp = String.valueOf(num.charAt(i)) + String.valueOf(num.charAt(i+1)) + String.valueOf(num.charAt(i+2));
            
           if(Arrays.asList(good).contains(temp)){
               ans = String.valueOf(Math.max(Integer.parseInt(temp) , Integer.parseInt(ans)));
               i+=2;
           }
        }
        
        if("0".equals(ans)){
            return "000";
        }
        
        return "-1".equals(ans) ? "" : String.valueOf(ans);
        }
}