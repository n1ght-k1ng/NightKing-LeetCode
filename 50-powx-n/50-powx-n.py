class Solution:
    def myPow(self, x: float, n: int) -> float:
        # product = 1
#         if(n ==0):
#             return 1
        
#         pow = abs(n)
       
#         for i in range(pow):
#             product = product*x
#         if(n<0) :
#             return (1/product)
#         return product

        
        #Deal with negative power:
        if n < 0: 
            x = 1/x
            n = abs(n)
            
        #Iterate:
        res = 1
        while n!=0:
            if (n % 2!=0):
                res = res*x
            x = x*x 
            n = n//2
            
        return res

        