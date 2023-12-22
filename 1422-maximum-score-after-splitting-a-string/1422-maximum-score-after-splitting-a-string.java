class Solution {
    public int maxScore(String s) {
        int left = -1;
        int zeros = 0;
        int one = 0;
        
        for(int i = 0 ; i < s.length() - 1 ;i++){
            if(s.charAt(i) =='0'){
                zeros++;
            }
            else{
                one++;
            }
            
            left = Math.max(left,zeros - one);
        }
        
    if (s.charAt(s.length() - 1) == '1') {
            one += 1;
        }

        return left + one;       
    }
        
        
    }
