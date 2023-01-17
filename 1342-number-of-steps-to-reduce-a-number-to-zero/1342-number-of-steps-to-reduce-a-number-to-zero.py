class Solution:
    def helper(self,num:int,c:int) ->int:
        
        if num == 0:
            return c
        if num%2 == 0:
            return self.helper(num//2,c+1)
        else:
            return self.helper(num-1,c+1)
    def numberOfSteps(self, num: int) -> int:
        return (self.helper(num,0))
        
        