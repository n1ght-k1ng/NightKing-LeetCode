class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        # for i in range(len(nums),2):
        #     if nums[len(nums)-1-i]-nums[i] ==  nums[len(nums)-2-i]-nums[i+1]:
        #         continue
        #     elif:]
        
#         s = 0 
#         e = len(nums) - 1
        
#         while(s <= e):
#             mid = s + (e-s)//2
#             if nums[mid+1] != nums[mid] and nums[mid-1] != nums[mid]:
#                 return nums[mid]
#             if (nums[mid + 1] != nums[mid]):
#                 e  = mid -1
#             if (nums[mid + 1] == nums[mid]):
#                 s = mid + 1
                
#             print(mid)
            
#         return nums[mid] 

        left, right = 0, len(nums) - 1
        while left < right:
            mid = (left + right) // 2
            if mid % 2 == 1:
                mid -= 1
            if nums[mid] != nums[mid + 1]:
                right = mid
            else:
                left = mid + 2
        return nums[left]
            