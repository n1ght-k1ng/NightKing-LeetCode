class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0 ;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < secret.length() ;i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bulls++;
                set.add(i);
            }
        }
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0 ;i < secret.length() ; i++){
            if(set.contains(i))
                continue;
            map1.put(secret.charAt(i), map1.getOrDefault(secret.charAt(i), 0) + 1);
            map2.put(guess.charAt(i), map2.getOrDefault(guess.charAt(i), 0) + 1);
        }
        
        int cows = 0;
        HashSet<Character> set2 = new HashSet<>();
        for(int i = 0 ; i < secret.length(); i++){
            if(set.contains(i) || set2.contains(secret.charAt(i)))
                continue;
            if(map2.containsKey(secret.charAt(i))){
                set2.add(secret.charAt(i));
                cows+= Math.min(map1.get(secret.charAt(i)) , map2.get(secret.charAt(i)));
            }
        }
        
        String ret = String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
        
        
        return ret;
        

        }
        
        
    }
