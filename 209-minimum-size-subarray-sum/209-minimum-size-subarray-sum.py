import sys
class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        
#         i = 0 
#         j = 0
#         sum1 = 0
#         min1 = 10000
#         while(i<j):
#             sum1 = sum1 + nums[j]
#             if sum1< target:
#                 j+=1
#             else:
#                 sum1 = sum1- nums[i]
#                 i+=1
#                 j+=1
               
            
#             if sum1 == target:
#                 min1 = min(min1,(j-i))
                
#         if min1 == 10000:
#             return 0
#         else:
#             return min1
        i = 0
        j = 0
        sum1 = 0
        min1 = sys.maxsize  # Use sys.maxsize instead of 10000
        
        while j < len(nums):
            sum1 += nums[j]
            
            while sum1 >= target:  # Use a nested while loop
                min1 = min(min1, j - i + 1)
                sum1 -= nums[i]
                i += 1
            
            j += 1
        
        if min1 == sys.maxsize:
            return 0
        else:
            return min1