class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
       
        copy = [num for num in nums] # copy the nums array
        n = len(nums)
        for i, num in enumerate(copy): # for every element in the copy
            nums[(i + k) % n] = copy[i]