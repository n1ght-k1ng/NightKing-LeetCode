import sys
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        max = -sys.maxsize - 1
        sum1 = 0
        for i in range(0,len(nums)):
            sum1 = sum1+nums[i]
            if(max<sum1):
                max = sum1
                
                
            if sum1<0:
                sum1=0
                
            
            
        return max
            
            
            
        