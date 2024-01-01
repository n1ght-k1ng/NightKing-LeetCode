class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i =0;
        int c = 0;
        int len = (g.length < s.length)? g.length : s.length;
        while(c < g.length && i < s.length){
            if(g[c] <= s[i]){
                c++;
                i++;
            }
            else
                i++;
        }
        return c ;
    }
}