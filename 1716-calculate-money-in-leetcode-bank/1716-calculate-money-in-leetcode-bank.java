class Solution {
    int sum(int left ,int right){
        int sum = 0;
        for(int i = left ; i<= right; i++)
            sum+=i;
        return sum;
    }
    
    
    public int totalMoney(int n) {
        boolean Monday = true;
        int res = 0;
        int start = 1;
        while(n>0){
            if(n/7 >0){
                res+=sum(start,start+6);
                n =  n- 7;
                start++;
            }else{
                for(int i= 1 ; i <= n; i++){
                    res = res+start;
                    start++;
                }
                n = 0;
            }
            
                }
        
        return res;
            }
        }
    
