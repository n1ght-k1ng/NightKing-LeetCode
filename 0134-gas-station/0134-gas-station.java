class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int ind = 0 ;
        int max = Integer.MIN_VALUE;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0 ; i < gas.length ; i++){
            
            if((gas[i] - cost[i]) >= 0){
                max = gas[i] - cost[i];
                ind = i;
                ls.add(i);
            }
        }
        int end;
        for(int k = 0; k < ls.size() ; k++){
            ind = ls.get(k); //2
            if(ind == 0){
                 end = gas.length -1;
            }
            else
            end = ind -1 ; //2
            int curr = gas[ind]; //4
            while(ind%gas.length != end){
                if(curr - cost[ind%gas.length] > 0){
                    curr = curr - cost[ind%gas.length];
                    ind ++;
                    curr = curr + gas[ind%gas.length];
                }
                else{
                    break;
                }
            }
            if(ind%gas.length == end && curr >= cost[end] ){
                return (end + 1)%gas.length;
            }
            
        }
        
        return -1;
        
        
    }
}