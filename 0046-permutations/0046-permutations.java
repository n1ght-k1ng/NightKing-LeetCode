class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, new ArrayList<>(), result);
        return result;
    }

    private static void generatePermutations(int[] nums, List<Integer> currentPermutation, List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }
        for (int num : nums) {
            if (currentPermutation.contains(num)) {
                continue; 
            }
            currentPermutation.add(num);
            generatePermutations(nums, currentPermutation, result);
            currentPermutation.remove(currentPermutation.size() - 1);  // Backtrack
        }
    }}
    
