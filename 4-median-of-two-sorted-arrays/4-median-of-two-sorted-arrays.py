class Solution:
    def findMedianSortedArrays(self, A: List[int], B: List[int]) -> float:
        
        m = len(A)
        n= len(B)
        for i in range(n):
            A.append(0)
        a,b,wrt = m-1,n-1,m+n-1
        while b>=0 :
            if a>=0 and A[a] >= B[b]:
                A[wrt] = A[a]
                a-=1
                
            else:
                A[wrt] = B[b]
                b-=1
            wrt-=1
        print(A)
        
        if(len(A) % 2 != 0):
            return A[len(A)//2]
        else:
            return ((A[len(A)//2] + A[len(A)//2 -1])/2)
            
#         nums3 = []
        
#         c = 0
#         for i in range(len(nums1)):
            
#             if nums1[i] < nums2[c]:
#                 nums3.append(nums1[i])
#             elif nums1[i] > nums2[c] :
#                 nums3.append(nums2[c])
#                 c+=1
#             else:
#                 nums3.append(nums1[i])
        
#         print(nums3)
        