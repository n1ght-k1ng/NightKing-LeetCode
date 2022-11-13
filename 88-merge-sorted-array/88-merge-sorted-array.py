class Solution:
    def merge(self, A: List[int], m: int, B: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # FORWARD APPROACHHHHH - NOT Working
         
#         if m ==0:
#             return B
#         if n ==0:
#             return A
        
#         res = [0]*len(A)
#         c=0
#         i=0
#         j=0
    
#         while(i<(m+n)):
#             if(A[i] <= B[j]):
#                 i+=1
#             elif(A[i] > B[j]):
#                 temp = A[i]
#                 A[i] = B[j]
#                 j+=1
#                 i+=1
#                 A[i] = temp
#             if(A[i] == 0):
#                 A[i] = B[j]
#                 j+=1
                
        
#         return A
    
    
        a,b,wrt = m-1,n-1,m+n-1
        while b>=0 :
            if a>=0 and A[a] >= B[b]:
                A[wrt] = A[a]
                a-=1
                
            else:
                A[wrt] = B[b]
                b-=1
            wrt-=1
            
                
    
        