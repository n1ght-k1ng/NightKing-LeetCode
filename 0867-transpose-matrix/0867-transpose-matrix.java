class Solution {
    public int[][] transpose(int[][] transpose) {
        int row = transpose.length;
        int col = transpose[0].length;
        
        int res[][] = new int [col][row];
        
        
        for(int i = 0 ; i< row ; i++){
            for (int j = 0 ;j<col;j++){
                res[j][i] = transpose[i][j];
            }
        }
        return res;    
     }
    
}