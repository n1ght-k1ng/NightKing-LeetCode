class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        
        candidates = sorted(candidates)
        ans = []
        
        def dfs(index, lst, targetTillNow):
            
            if targetTillNow < 0:
                return
            if targetTillNow == 0:
                ans.append(lst[:])
                return
            for i in range(index, len(candidates)):
                if i > index and candidates[i] == candidates[i-1]:
                    continue
                lst.append(candidates[i])
                dfs(i+1, lst, targetTillNow - candidates[i])
                lst.pop(-1)
        
        dfs(0, [], target)
        return ans



# class Solution:
    

#     def findCombinations(self,ind, arr, target, ans, ds):
#         if target < 0:
#             return
#         if target == 0:
#             print("heyy")
#             ans.append(ds[:])
#             return 
#         print(target)
#         for i in range(ind, len(arr)):
#             if i > ind and arr[i] == arr[i - 1]: # while moving the index skip the consecutive repeated elements because they will form duplicate sequences.
#                 continue
#             if arr[i] > target: # if(arr[i] > target) then terminate the recursive call because there is no use to check as the array is sorted
#                 break

#             ds.append(arr[i])
#             self.findCombinations(i + 1, arr, target - arr[i], ans, ds)
#             ds.pop(-1)

#     def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
#         ds = []
#         ans = [[]]
#         sorted(candidates)
# #         def findCombinations(ind, arr, target, ans, ds):
# #             if target == 0:
# #                 print("heyy")
# #                 ans.append(ds[:])
# #                 return 
# #             print(target)
# #             for i in range(ind, len(arr)):
# #                 if i > ind and arr[i] == arr[i - 1]: # while moving the index skip the consecutive repeated elements because they will form duplicate sequences.
# #                     continue
# #                 if arr[i] > target: # if(arr[i] > target) then terminate the recursive call because there is no use to check as the array is sorted
# #                     break

# #                 ds.append(arr[i])
# #                 findCombinations(i + 1, arr, target - arr[i], ans, ds)
# #                 ds.pop()
#         self.findCombinations(0, candidates, target ,ans,ds)
      