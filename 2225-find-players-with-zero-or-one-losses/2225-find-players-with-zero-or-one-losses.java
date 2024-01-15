
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> res= new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for(int i = 0 ; i < matches.length ; i++){
            set.add(matches[i][0]);
            map.put(matches[i][1] , map.getOrDefault(matches[i][1] , 0) + 1);
        }
        
        for(int i = 0 ; i < matches.length ; i++){
            if(map.get(matches[i][1]) == 1)
                res.get(1).add(matches[i][1]);
            if(set.contains(matches[i][0]) && !map.containsKey(matches[i][0])){
                set.remove(matches[i][0]);
                res.get(0).add(matches[i][0]);
            }
        }
        Collections.sort(res.get(0));
        Collections.sort(res.get(1));
        return res;
    }
}