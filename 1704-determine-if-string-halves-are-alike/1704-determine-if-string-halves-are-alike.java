class Solution {
    public boolean halvesAreAlike(String s) {
      
      s = s.toLowerCase();
      Set<Character> set = new HashSet<>();
      set.add('a');
      set.add('e');
      set.add('i');
      set.add('o');
      set.add('u');

      int i =0;
      int j = s.length()/2;
      int v1 = 0;
      int v2 =0;
      while( i < s.length()/2 && j < s.length()){
        if(set.contains(s.charAt(i))){
        v1++;
      }
        if(set.contains(s.charAt(j)))
          v2++;
          i++;j++;
      }
      
      return v1 == v2;

    }
}