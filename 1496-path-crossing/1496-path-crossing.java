class Solution {
    class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
    public boolean isPathCrossing(String path) {
        Set<Point> set = new HashSet<>();
        
        
        int x = 0 ; 
        int y = 0 ;
        Point point = new Point(x ,y);
        set.add(point);
        
        for(int i =0 ; i < path.length() ; i++){
            if(path.charAt(i) == 'N'){
                x++;
            }
            if(path.charAt(i) == 'S'){
                x--;
            }
            if(path.charAt(i) == 'E'){
                y--;
            }
            if(path.charAt(i) == 'W'){
                y++;
            }
            Point check = new Point(x , y);
            if(set.contains(check)){
                return true;
            }
            set.add(check);
            
        }
        return false;
    }
}