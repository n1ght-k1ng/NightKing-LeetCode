import sys
class Solution:
    def maxProfit(self, nums: List[int]) -> int:
#         arr = sorted(nums)
#         max = -sys.maxsize-1
#         j=1
#         i=0
#         flag = 0
#         while(j>i and j<len(nums)):
#             if(nums[j] - nums[i] > 0):
#                 pf = nums[j] - nums[i]
#                 if(pf>max):
#                     max=pf
#                     flag = 1
#                 j+=1
#             elif(nums[j] - nums[i] < 0 ):
#                 i+=1
#                 j+=1
#         if flag ==1:
#             return max
#         else:
#             return 0

        if(len(nums) == 0): return 0
        else:
            profit = 0
            minbuy = nums[0]
            for i in range(len(nums)):
                profit = max(nums[i]-minbuy,profit)
                minbuy = min(minbuy, nums[i])
            return profit
                
                
                
            
            
                
            
            
        
        