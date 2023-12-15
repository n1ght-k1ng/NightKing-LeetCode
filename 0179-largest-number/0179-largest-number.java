class Solution {
    class CustomComparator implements Comparator<String>{
        @Override
        public int compare(String s1, String s2){
            String combination1 = s1 + s2;
            String combination2 = s2 + s1;

            return combination2.compareTo(combination1);
        }
    }
    public String largestNumber(int[] nums) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(new CustomComparator());
        for(int num: nums){
            pq.add(String.valueOf(num));
        }
        StringBuilder ans = new StringBuilder("");
        while(!pq.isEmpty()){
            ans.insert(ans.length(),pq.poll());
        }
        if(ans.charAt(0) == '0')
            return "0";
        return ans.toString();
    }
}