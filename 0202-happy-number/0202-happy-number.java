class Solution {
    public boolean isHappy(int n) {
        
        if( n == 1){
            return true;
        }
        int s = n;
        int f = findSquare(n);
        
        while(s !=f){
            if(f == 1 || s == 1){
                return true;
            }
            s = findSquare(s);
            f = findSquare(findSquare(f));
        }
        
        return false;
        
    }
    
    public int findSquare(int n){
        int ans = 0; 
        while(n >0){
            int d = n%10;
            ans = ans + d*d;
            n= n/10;
        }
        
        return ans;
    }
}