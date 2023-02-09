class Solution:
    def findCombinations(self,index,arr,ds,ans):
        if index == len(arr):
            ans.append([ele for ele in ds])
            return 
        ds.append(arr[index])
        self.findCombinations(index+1,arr,ds,ans)
        ds.remove(arr[index])
        self.findCombinations(index+1,arr,ds,ans)
    def subsetsWithDup(self, arr: List[int]) -> List[List[int]]:
        ans = []
        arr= sorted(arr)
        self.findCombinations(0,arr,[],ans)
        tup = set(tuple(lst) for lst in ans)
        return list(tup)
        
        