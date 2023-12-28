class Solution {
    public char findKthBit(int n, int k) {
        return helper(n, k);
    }

    private char helper(int n, int k) {
        if (n == 1) {
            return '0';
        }

        int length = (1 << n) - 1; // Length of the string at level n

        if (k == (length + 1) / 2) {
            return '1';
        } else if (k < (length + 1) / 2) {
            return helper(n - 1, k);
        } else {
            return invert(helper(n - 1, length - k + 1));
        }
    }

    private char invert(char c) {
        return (c == '1') ? '0' : '1';
    }
}