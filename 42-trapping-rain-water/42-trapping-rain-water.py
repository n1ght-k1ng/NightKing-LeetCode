class Solution:
    def trap(self, a: List[int]) -> int:
        l, r = 0 ,len(a)-1
        res = 0 
        lftmax , rgtmax = 0,0
        
        while l<=r:
            if a[l]<=a[r] :
                if a[l]>=lftmax:
                    lftmax = a[l]
                else:
                    res += lftmax-a[l]
                l+=1
            else:
                if a[r]>=rgtmax:
                    rgtmax =a[r]
                else:
                    res += rgtmax-a[r]
                r-=1
        return res