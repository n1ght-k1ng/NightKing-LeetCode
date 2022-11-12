class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # for i in range(0,len(nums)):
        #     for j in range(i+1,len(nums)):
        #         if(nums[i]>nums[j]):
        #             temp = nums[i]
        #             nums[i] = nums[j]
        #             nums[j] = temp
        # return nums
        
        m0 = nums.count(0)
        m1= m0 + nums.count(1)
        m2 = m1 + nums.count(2)
        j = 0
        while(j<len(nums)):
            if j<m0:
                nums[j] = 0
            elif j<m1:
                nums[j] = 1 
            elif j<m2:
                nums[j] = 2
            j+=1
        return nums