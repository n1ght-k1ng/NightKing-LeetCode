class Solution {
    boolean isOperator(String s ){
        if(s.length() == 1 && (s.charAt(0) == '+' || s.charAt(0) == '-' ||s.charAt(0) == '*' ||s.charAt(0) == '/'))
            return true;
        else
            return false;
    }
    public int evalRPN(String[] token) {
        
        
        Stack<String> stack = new Stack<>();
        
        int second =0;
        int first=0;
        for(int i = 0 ; i < token.length ; i++){
            if(isOperator(token[i])){
                second = Integer.valueOf(stack.pop());    
                first = Integer.valueOf(stack.pop());
                if(token[i].charAt(0) == '+'){
                    stack.push(String.valueOf(first+second));
                }
                
                if(token[i].charAt(0) == '-'){
                    stack.push(String.valueOf(first-second));
                }
                
                if(token[i].charAt(0) == '*'){
                    stack.push(String.valueOf(first*second));
                }
                if(token[i].charAt(0) == '/'){
                    stack.push(String.valueOf(first/second));
                }
            }
            
            else{
                stack.push(token[i]);
        }
        }
        
        if(!isOperator(stack.peek()))
            return Integer.valueOf(stack.pop());
        else{
            return -1;
        }
        
    }
}