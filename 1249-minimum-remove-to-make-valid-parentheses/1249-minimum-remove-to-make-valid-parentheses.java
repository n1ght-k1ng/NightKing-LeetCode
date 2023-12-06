class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch))
                continue;
            if(ch == '(')
                stack.push(i);
            else {
                if(!stack.isEmpty() && s.charAt(stack.peek()) == '(')
                    stack.pop();
                else stack.push(i);
            }
        }
        
        StringBuilder result = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(stack);
        for(int i=0;i<s.length();i++)
            if(!set.contains(i))
                result.append(s.charAt(i));
        
        return result.toString();
    }
}


// class Solution {
//     public String minRemoveToMakeValid(String s) {
//         String ret ="";
        
//         Stack <Character> stack = new Stack<>();
//         for(int i = 0; i< s.length();i++){
//             char ch = s.charAt(i) ;
//             if(ch == '('){
//                 stack.push(ch);
//             }
//             if(!stack.isEmpty() && ch == ')'){
//                 stack.pop();
//             }
            
//             if(stack.isEmpty() && ch == ')'){
//                 stack.push(ch);
//             }
//         }
//         int i = 0;
//         while(i < s.length() && s.charAt(i) == ')' ){
//             i+=1;
//         }
//         for(i = i ; i<s.length() ; i++){
//             if(!stack.isEmpty() && s.charAt(i) == stack.peek()){
//                 stack.pop();
//             }else{
//                 ret += s.charAt(i);
//             }
//         }
//         return ret;
        
        
//     }
// }