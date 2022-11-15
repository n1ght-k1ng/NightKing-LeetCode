class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
#         nums = sorted(nums)
#         print(nums)
#         c=1
#         maxele = 0
#         j =1 
#         i=0
#         res = 0
#         if(len(nums) == 1):
#             return nums[0]
#         while(j<len(nums)):
#             if(nums[i] == nums[j]):
#                 c+=1
#                 j+=1
#                 i+=1
#             else:
#                 if(c>maxele):
#                     maxele = c
#                     res = nums[j]
#                 c=1
#                 if(j == len(nums)-1):
#                     break
#                 if(c == len(nums)):
#                     res = nums[0]
#                 j+=1
                
#         return res
        
        sol = None
        cnt = 0 
        for i in nums:
            if(cnt == 0):            
                sol = i
            cnt += (1 if sol == i else -1)
        return sol
    
        
        
        
    
            
            
        