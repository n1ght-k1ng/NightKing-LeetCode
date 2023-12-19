class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int mini = Integer.MAX_VALUE;
        int save = 0;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int f = i + 1;
            int l = nums.length - 1;

            while (f < l) {
                int sum = nums[i] + nums[f] + nums[l];
                int diff = Math.abs(sum - target);

                if (diff < mini) {
                    mini = diff;
                    save = sum;
                }

                if (sum < target) {
                    f++;
                } else {
                    l--;
                }
            }
        }

        return save;
    }
}

