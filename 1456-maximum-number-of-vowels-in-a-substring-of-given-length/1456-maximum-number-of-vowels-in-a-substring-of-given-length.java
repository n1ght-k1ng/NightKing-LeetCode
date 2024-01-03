// class Solution {
//     private int vowels(String s , int left , int right){
//         int count = 0;
//         for(int i = left ; i < right ; i++){
//             char c = s.charAt(i);
//             char lowerCaseChar = Character.toLowerCase(c);
//      if(lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i'
//             || lowerCaseChar == 'o' || lowerCaseChar == 'u')
//          count++;;
// }
//         return count;
//         }
//     public int maxVowels(String s, int k) {
//          int max = 0;
//         for(int i = 0 ; i <= s.length()-k ; i++){
//             max = Math.max(max , vowels(s , i , i+k))  ; 
//             }
//         return max;
//     }
// } -- TLE 

class Solution {
    public int maxVowels(String s, int k) {
        int maxVowelCount = 0;
        int currentVowelCount = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char currentChar = s.charAt(windowEnd);

            if (isVowel(currentChar)) {
                currentVowelCount++;
            }

            if (windowEnd - windowStart + 1 > k) {
                char startChar = s.charAt(windowStart);
                if (isVowel(startChar)) {
                    currentVowelCount--;
                }
                windowStart++;
            }

            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        return maxVowelCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}