class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int power = 1;
        int curr = 1;

        while(curr <= n) {
            curr = (int)Math.pow(power++, 2);
            list.add(curr);
        }

        int[][] t = new int[list.size() + 1][n + 1];

        for(int i = 0; i <= list.size(); i++) {
            for(int j = 0; j <= n; j++) {
                if(j == 0)
                    t[i][j] = 0;
                else if(i == 0)
                    t[i][j] = Integer.MAX_VALUE - 1;
            }
        }

        for(int i = 1; i <= list.size(); i++) {
            for(int j = 1; j <= n; j++) {
                if(list.get(i - 1) <= j) {
                    t[i][j] = Math.min(t[i][j - list.get(i - 1)] + 1, t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[list.size()][n];
    }
}