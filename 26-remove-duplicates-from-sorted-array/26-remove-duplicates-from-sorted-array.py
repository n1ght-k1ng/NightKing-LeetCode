class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return nums
        i,j = 1,1
        while j < len(nums):
            if nums[j]!=nums[i-1]:
                nums[i] = nums[j]
                i+=1
            j+=1
            
        return i