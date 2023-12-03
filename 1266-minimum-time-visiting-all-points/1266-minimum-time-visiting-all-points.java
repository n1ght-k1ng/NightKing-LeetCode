class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int pathLen = points.length;
        int count = 0;
        int current[] = points[0];
        int next[] = new int[2];
        for(int i = 1 ; i < pathLen ; i++){
            next = points[i];
            int steps = Math.max(Math.abs(next[0]-current[0]), Math.abs(next[1]-current[1]));
            current = next;
            count = count + steps;
        }
        
        return count;
        
    }
}