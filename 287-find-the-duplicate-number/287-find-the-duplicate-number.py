class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        
        a ={}
        for i in nums:
            if(i in a):
                a[i] +=1
            else:
                a[i] = 1
        
        for i in a.keys():
            if a[i] >= 2:
                return i
        
        
            
        