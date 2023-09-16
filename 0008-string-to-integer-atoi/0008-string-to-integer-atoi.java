// import java.util.HashSet;
// class Solution {
//     public int myAtoi(String s) {
        
        
//         HashSet <Character> numset = new HashSet<>();
//         String newstr  = s.trim();
//         System.out.println("trim "+newstr);
//         numset.add('1');
//         numset.add('2');
//         numset.add('3');
//         numset.add('4');
//         numset.add('5');
//         numset.add('6');
//         numset.add('7');
//         numset.add('8');
//         numset.add('9');
//         numset.add('0');
//         String result = "";
//         Boolean isNegative = false;
//         for (int i = 0 ; i < newstr.length() ; i++){
//             if(s.charAt(i) == '-')
//                 isNegative = true;
//             if(numset.contains(s.charAt(i))){
//                 result = result + String.valueOf(s.charAt(i));
//             }  
            
//         }
//         System.out.println("print"+result);
//         if(isNegative)
//         result = "-"+result;
        
//         int res = Integer.parseInt(result);
        
        

//         return res;
        
//     }
    
    
// }

import java.util.HashSet;

class Solution {
    public int myAtoi(String s) {
        // Remove leading and trailing whitespaces
        String newStr = s.trim();

        // Handle empty string or string with just a sign character
        if (newStr.isEmpty()) {
            return 0;
        }

        // Create a set to store numeric characters
        HashSet<Character> numSet = new HashSet<>();
        numSet.add('0');
        numSet.add('1');
        numSet.add('2');
        numSet.add('3');
        numSet.add('4');
        numSet.add('5');
        numSet.add('6');
        numSet.add('7');
        numSet.add('8');
        numSet.add('9');

        String result = "";
        boolean isNegative = false;

        // Check for a sign character at the beginning
        if (newStr.charAt(0) == '-') {
            isNegative = true;
        } else if (newStr.charAt(0) == '+') {
            // Handle the case where there is a plus sign
            // before the number (optional)
        } else if (!numSet.contains(newStr.charAt(0))) {
            // Return 0 if the first character is not a sign or a numeric character
            return 0;
        } else {
            // If the first character is numeric, add it to the result
            result += newStr.charAt(0);
        }

        // Iterate through the remaining characters
        for (int i = 1; i < newStr.length(); i++) {
            char c = newStr.charAt(i);
            if (numSet.contains(c)) {
                result += c;
            } else {
                // Break the loop if a non-numeric character is encountered
                break;
            }
        }

        // Check if the result is empty (no valid numeric characters)
        if (result.isEmpty()) {
            return 0;
        }

        // Handle the sign
        if (isNegative) {
            result = "-" + result;
        }

        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            // Handle the case where the result is out of the range of integers
            if (isNegative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}