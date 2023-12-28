class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sum = 0;
        int index = 0;
        for(int i : chalk){
            sum+=i;
            index++;
            if(sum > k){
                return index -1;
            }
        }
        sum = k % sum;
        index = 0;
        int sum2 = 0;
        for (int i : chalk){
            sum2+=i;
            index++;
            if(sum2 > sum){
                break;
            }
        }
        return index -1;
        
    }
}