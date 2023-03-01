class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        st = 0
        end = len(nums) - 1
        while(st<=end):
            mid = st + ((end-st)//2)
            
            if target > nums[mid]:
                st = mid + 1
            elif target < nums[mid]:
                end = mid - 1 
            else:
                return mid
        return st