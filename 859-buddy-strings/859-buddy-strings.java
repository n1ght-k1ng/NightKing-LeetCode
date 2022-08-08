class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        if(s.length() != goal.length())
            return false;
        // if(s.equals(goal) && s.length() ==2 && s.charAt(0) == s.charAt(1))
        //     return true;
        // if(s.equals(goal)&& s.length() !=2 )
        //     return true;
        char [] arr1 = new char [3];
        char [] arr2 = new char [3];
        int c= 0;
        int i =0; List<Character> list = new ArrayList<>();
        if(s.equals(goal)){
            for(i=0; i<s.length(); i++){
                if(list.contains(s.charAt(i)))
                    return true;
                else
                    list.add(s.charAt(i));
            }
        }
        // i=0;
        while(i < s.length())
        {
            if(s.charAt(i) != goal.charAt(i))
            {   
                arr1[c] = s.charAt(i);
                arr2[c]=goal.charAt(i);
                c++; 
                if(c > 2)
                    return false;
                
            }
            i++;
        }
        
        System.out.println("it reaches here");
        if(arr1[0] == arr2[1] && arr1[1] == arr2[0] && c==2)
            return true;
        else
            return false;
    }
}