class Solution:
    def findanswer(self,ind , arr , target ,ans ,ds):
            if ind == len(arr):
                if target == 0: 
                    ans.append([ele for ele in ds])   
                return
            
            if (arr[ind] <= target):
                ds.append(arr[ind])
                self.findanswer(ind,arr,target-arr[ind],ans,ds)
                ds.remove(ds[len(ds)-1])
            self.findanswer(ind+1,arr,target , ans ,ds)

    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = []
        self.findanswer(0, candidates, target ,ans,[])
        return ans
    
    #         if sum1 == target:
#             ans.append(ds)
#             return
#         if sum1 < target :
#             sum1 = sum1 + candidates[0] 
#             ds.append(candidates[0])
#             self.findanswer(candidates, target ,ans,ds, sum1)
#         if sum1 > target:
#             if not ds:
#                ds.pop()
#             sef.findanswer(candidates[1::], target , ans ,ds, sum1)