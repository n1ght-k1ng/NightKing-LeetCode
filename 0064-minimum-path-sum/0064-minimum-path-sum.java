// class Solution {
//     int min = Integer.MAX_VALUE;
//     public int minPathSum(int[][] grid) {
        
//         helper(grid , 0 , 0 , 0);
//         return min;
//     }
//     private void helper(int [][] grid ,int row , int col , int sum){
//         if(row == grid.length-1 && col == grid[0].length-1){
//             sum+=grid[row][col];
//             min = Math.min(sum , min);
//         }
        
//         sum += grid[row][col];
//         if(col < grid[0].length-1)
//             helper(grid,row, col+1 , sum);
//         if (row < grid.length-1)
//             helper(grid,row+1 ,col ,sum);
        
//         sum -= grid[row][col];
//     }
    
// } -- TLE 

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] memo = new int[m][n];
        return helper(grid, 0, 0, memo);
    }

    private int helper(int[][] grid, int row, int col, int[][] memo) {
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return grid[row][col];
        }

        if (memo[row][col] > 0) {
            return memo[row][col];
        }

        int right = col < grid[0].length - 1 ? helper(grid, row, col + 1, memo) : Integer.MAX_VALUE;
        int down = row < grid.length - 1 ? helper(grid, row + 1, col, memo) : Integer.MAX_VALUE;

        int minPath = grid[row][col] + Math.min(right, down);
        memo[row][col] = minPath;

        return minPath;
    }
}
