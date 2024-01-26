class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1];
        for (int[][] d : dp)
            for (int[] s : d)
                Arrays.fill(s, -1);
        return totalPath(m, n, maxMove, startRow, startColumn, dp);
    }
    public int totalPath(int m, int n, int move, int i, int j, int[][][] dp) {
        if (j < 0 || i < 0 || i >= m || j >= n)
            return 1;
        if (move == 0)
            return 0;
        if (dp[i][j][move] != -1)
            return dp[i][j][move];
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int ans = 0;
        for (int k = 0; k < 4; k++) {
            int r = i + dx[k];
            int c = j + dy[k];
            ans = (ans + totalPath(m, n, move - 1, r, c, dp) % 1000000007)% 1000000007;
        }
         dp[i][j][move] = ans;
         return ans;
    }
}