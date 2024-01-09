class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        List<List<Integer>> rows = new ArrayList<>();
        List<List<Integer>> cols = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> temp2 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(grid[i][j]);
                temp2.add(grid[j][i]);
            }
            rows.add(temp);
            cols.add(temp2);
        }
        
        for(int i =0 ; i < n ; i++){
            for(int j =0 ;j < n ;j++){
                if(rows.get(i).equals(cols.get(j)))
                    count++;
            }
        }
        
        return count;
    }
}