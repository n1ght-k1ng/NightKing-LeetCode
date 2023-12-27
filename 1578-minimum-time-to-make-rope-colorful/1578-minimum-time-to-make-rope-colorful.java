import java.util.Collections;

class Solution {
    
    private static int calculateSum(List<Integer> list) {
        int sum = 0;
        int max = 0;
        for (int number : list) {
            sum += number;
            max = Math.max(max , number);
        }
        return sum - max;
    }
    
    public int minCost(String colors, int[] neededTime) {
        
        int res = 0;
        int i = 1;
        char curr = colors.charAt(0);
        List<Integer> lst = new ArrayList<>();
        lst.add(neededTime[0]);
        while(i < colors.length()){
            if(colors.charAt(i) == curr){
                lst.add(neededTime[i]);
                i++;
            }
            else if(lst.size() > 1){
                int sum = calculateSum(lst);
                res += sum;
                curr = colors.charAt(i); // b
                lst.clear();
                lst.add(neededTime[i]);
                i++;
            }
            else{
                curr = colors.charAt(i); 
                lst.clear();
                lst.add(neededTime[i]); 
                i++;
                
            }
            
        }
        if(lst.size() > 1){
        int sum = calculateSum(lst);
        res += sum;
        }
        return res;
    }
}