class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        String start = paths.get(0).get(0);
        String end = paths.get(0).get(1);
        for(int i =0 ; i < paths.size() ; i++){
            List<String> path = paths.get(i);
            System.out.println("s " + path.get(0) + "D "+path.get(1));
            map.put(path.get(0), path.get(1));
        }
        

            
            while(map.containsKey(start)){
                end = map.get(start);
                start = end;
            }
        return start;        
        
    }
}