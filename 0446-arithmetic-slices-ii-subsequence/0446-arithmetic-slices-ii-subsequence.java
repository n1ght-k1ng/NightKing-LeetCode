class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        boolean isAllElementsEqual = Arrays.stream(nums).allMatch(num -> num == nums[0]);
        if (isAllElementsEqual) { /* Avoid TLE */
            int totalSubsequence = (int) (Math.pow(2, nums.length) - 1);
            int oneSizedSubsequence = nums.length;
            int twoSizedSubsequence = ((nums.length * (nums.length - 1)) / 2);
            return totalSubsequence - oneSizedSubsequence - twoSizedSubsequence;
        }

        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long commonDiff = (long) nums[j] - (long) nums[i]; // Avoids overflow
                ans += numberOfArithmeticSlices(nums, j + 1, commonDiff, 2);
            }
        }
        return ans;
    }

    public int numberOfArithmeticSlices(int[] nums, int nextIndex, long commonDiff, int size) {
        int total = 0;
        if (size >= 3) total += 1;
        for (int i = nextIndex; i < nums.length; i++) {
            long previous = nums[nextIndex - 1];
            if ((nums[i] - previous) == commonDiff) {
                total += numberOfArithmeticSlices(nums, i + 1, commonDiff, size + 1);
            }
        }
        return total;
    }
}