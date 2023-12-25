// import java.util.HashMap;

// class Solution {
//     int num = 0;
//     int count = 0;
//     HashMap<Character, Integer> map = new HashMap<>();

//     public int numDecodings(String s) {
//         if (s == null || s.length() == 0 || s.charAt(0) == '0') {
//             return 0;
//         }

//         for (int i = 0; i < 26; i++) {
//             int c = 'A' + i;
//             map.put((char) c, i + 1);
//         }

//         helper(s, 0);

//         return num;
//     }

//     public void helper(String s, int index) {
//         if (index == s.length()) {
//             num += 1;
//             return;
//         }


//         char singleDigit = s.charAt(index);
//         if (singleDigit != '0') {
//             helper(s, index + 1);
//         }

//         if (index + 1 < s.length()) {
//             char twoDigitsFirstChar = s.charAt(index);
//             char twoDigitsSecondChar = s.charAt(index + 1);
//             int twoDigits = Integer.parseInt("" + twoDigitsFirstChar + twoDigitsSecondChar);

//             if (twoDigits >= 10 && twoDigits <= 26) {
//                 helper(s, index + 2);
//             }
//         }
//     }
// }


import java.util.Arrays;

class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Empty string has one decoding
        dp[1] = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}