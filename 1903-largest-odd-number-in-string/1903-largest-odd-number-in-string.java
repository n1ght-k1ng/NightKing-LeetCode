import java.math.BigInteger;
class Solution {
    public String largestOddNumber(String num) {
        String ret = "";
        for (int i= num.length()-1; i >= 0 ; i--){
            int last = (int) num.charAt(i);
            if(last % 2 ==1){
                ret = num.substring(0,i+1);
                break;
            }
        }
        return ret;
    }
}