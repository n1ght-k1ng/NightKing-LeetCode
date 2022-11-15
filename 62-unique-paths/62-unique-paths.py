class Solution:
    def factorial(self, fact: int) -> int:
        res = 1
        for i in range(1,fact+1):
            res = res * fact 
        return res
    def uniquePaths(self, m: int, n: int) -> int:
        
        m = m-1
        n = n-1
        return ((factorial(m+n))//(factorial(m)*factorial(n)))
        
        
        
        
        