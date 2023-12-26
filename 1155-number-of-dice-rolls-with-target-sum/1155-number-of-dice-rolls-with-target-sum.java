class Solution {
    static int mod = 1000000000+7;
    
    public int numRollsToTarget(int n, int k, int target) {
        return dpSolution(n,k,target);
    }
    
    public int dpSolution(int n,int k,int target){
        int[][] dp = new int[n+1][target+1];
        dp[0][0] = 1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                long res = 0l;
                for(int x=1;x<=k;x++){
                    if(j-x>=0){
                        res += dp[i-1][j-x]%mod;
                    }
                }
                dp[i][j] = (int)(res%mod);
            }
        }
        
        return dp[n][target];
    }
 }