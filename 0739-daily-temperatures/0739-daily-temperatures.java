class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans = new int[t.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < t.length; i++){
            int top;
            while((!stack.empty()) && t[stack.peek()] < t[i]){
                top = stack.pop();
                ans[top] = i - top;
            }
            stack.push(i);
        }
        return ans;
    }
}