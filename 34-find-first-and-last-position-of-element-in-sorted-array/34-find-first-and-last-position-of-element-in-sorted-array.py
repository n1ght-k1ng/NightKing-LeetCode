class Solution:
    def search(self,nums , target , findStart):
        st = 0 
        end = len(nums) -1
        ans = -1 
        while (st<=end):
            mid = st + ((end-st)//2)
            if target > nums[mid]:
                st = mid + 1
            elif target < nums[mid]:
                end = mid -1
            else:
                ans = mid 
                if findStart == True:
                    end = mid -1 
                else:
                    st = mid + 1
        return ans 
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        anss= []
        anss.append(self.search(nums,target,True))
        anss.append(self.search(nums,target,False))
        return anss

                

                