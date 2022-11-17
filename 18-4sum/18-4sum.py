class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        
#         d={}
    
#         res = set()
#         for i in range(len(nums)):
#             d[i] = i 
#         nums = sorted(nums)
#         for i in range(len(nums)):
#             for j in range(i+1,len(nums)):
#                 for k in range(j+1,len(nums)):
#                     diff = target - nums[i] - nums[j] - nums[k]
#                     if(diff in nums[k+1:]):
#                         res.add(tuple(sorted(([nums[i],nums[j],nums[k],diff]))))
                        
#         return res
        nums.sort()
        ans = set()
        n = len(nums)
        for i in range(n):
            for j in range(i+1, n):
                # two sum problem solution
                new_target = target - (nums[i] + nums[j])
                start = j+1
                end = n-1
                while end > start:
                    if(nums[start] + nums[end] == new_target):
                        ans.add((nums[i], nums[j], nums[start], nums[end]))
                        end -= 1
                        start += 1
                    elif nums[start] + nums[end] > new_target:
                        end -= 1
                    else:
                        start += 1
        return ans
        
         # ans.add(tuple(sorted((nums[i], nums[left], nums[right],nums[j]))))