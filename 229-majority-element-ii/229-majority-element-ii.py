class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        d = {}
        res = []
        for i in nums:
            if(i in d):
                d[i] +=1
            else:
                d[i]=1
        for i in d.keys():
            if(d[i] > (len(nums)//3)):
                res.append(i)
        return res
    
                
                
                
        