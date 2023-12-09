class Solution {
    public int reverse(int x) {
        int rev = 0;
        boolean n = false;
        if(x < 0){
            n = true;
            x = x *-1;
        }
        while(x>0){
            int d = x%10;
                        if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0; // Overflow
            }

            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0; // Overflow
            }

            rev = rev*10 + d;
            x=x/10;
        }
        if(n == true)
            return rev * -1;
        return rev;
    }
}