class Solution {
    
    private int ans(int[][] grid, int row , int col){
        int ones = 0;
        int zeros = 0; 
        for(int i = 0 ; i< grid[0].length ; i++){
            if(grid[row][i] == 1){
                ones++;
            }else{
                zeros++;
            }
        }
        int colOnes = 0;
        int colzeros = 0;
        for(int i = 0 ; i< grid.length ; i++){
            if(grid[i][col] == 1){
                colOnes++;
            }else{
                colzeros++;
            }
        }
        // int ret[] = new int[4];
        // ret[0] = ones;
        // ret[1] = zeros;
        // ret[2] = colOnes;
        // ret[3] = colzeros
        return (ones+colOnes - zeros - colzeros);
    }
//         private int[] col(int[][] grid, int col){
//         int ones = 0;
//         int zeros = 0; 
//         for(int i = 0 ; i< grid[0].length ; i++){
//             if(grid[row][i] == 1){
//                 ones++;
//             }else{
//                 zeros++;
//             }
//         }
        
//         int ret[] = new int[2];
//         ret[0] = ones;
//         ret[1] = zeros;
//         return ret;
//     }
    
    
    public int[][] onesMinusZeros(int[][] grid) {

        int diff[][] = new int[grid.length][grid[0].length];
        if(grid.length == 1){
            int count = 0;
            for(int i =0 ; i< grid[0].length ;i++){
                if(grid[0][i] == 1)
                    count++;
                else
                    count--;
            }
            for(int i =0 ; i< grid[0].length ;i++){
                if(grid[0][i] == 0)
                    grid[0][i] = count-1;
                else
                    grid[0][i] = count+1;
            }
            return grid;
            
            
        }
        if(grid[0].length == 1){
            int count = 0;
            for(int i =0 ; i< grid.length ;i++){
                if(grid[i][0] == 1)
                    count++;
                else
                    count--;
            }
            for(int i =0 ; i< grid.length ;i++){
                if(grid[i][0] == 0)
                    grid[i][0] = count-1;
                else
                    grid[i][0] = count+1;
            }
            return grid;
            
            
        }
        for(int i =0 ; i< grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                diff[i][j] = ans(grid , i ,j);
            }
        }
        return diff;
        

        
        
        
        
        }
}