#   ## TLE ##
#     def perm(self,prefix,suffix,l):
#         if len(suffix) == 0:
#             l.append([ele for ele in prefix])
#             return
#         for i in range(len(suffix)):
#             self.perm(prefix + suffix[i], suffix[:i]+suffix[i+1:],l)
#     def getPermutation(self, n: int, k: int) -> str:
#         st = ""
#         for i in range(1,n+1):
#             st=st+str(i)
#         l = [[]]
#         self.perm("",st,l)
#         return ''.join(l[k])
import math     
class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        
        arr = [ele for ele in range(1,n+1)]
        st = ""
        k = k-1
        
        while(n >0):
            digit = k//math.factorial(n-1)
            print(arr)
            st= st + str(arr[digit])
            arr.remove(arr[digit])
            k = k %math.factorial(n-1)
            n-=1
        return st 