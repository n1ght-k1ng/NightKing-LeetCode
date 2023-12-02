class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] map = new int[26];
        int res = 0;

        for (int i = 0; i < chars.length(); i++) {
            map[chars.charAt(i) - 'a']++;
        }

        for (String word : words) {
            int[] tempMap = map.clone();
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                if (tempMap[word.charAt(i) - 'a'] == 0) {
                    flag = false;
                    break;
                } else {
                    tempMap[word.charAt(i) - 'a']--;
                }
            }
            if (flag) res += word.length();
        }

        return res;
    }
}