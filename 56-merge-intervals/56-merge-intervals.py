class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # arr = [[0]*2]*len(A)
        # c=0
        # A.sort(key=lambda x: (x[0]))
        # print(A)
        # if(len(A) ==1):
        #     return A
        # if(len(A) == 2 and A[0][1] < A[1][0]):
        #     return A
        # for i in range(0,len(A)-1):
        #     if(A[i+1][0] <= A[i][1]):
        #         arr[c] = list((min(A[i][0],A[i+1][0]),max(A[i+1][1],A[i][1])))
        #         c+=1
        #         continue
        #     arr[c] = A[i+1]
        #     c+=1
        # arr.remove([0,0])
        # return merge(arr)
        
        res = []
        for i in sorted(intervals, key=lambda x: x[0]):
            if res and i[0] <= res[-1][1]:
                res[-1][1] = max(i[1], res[-1][1])
            else:
                res.append(i)
        return res
        
    # and A[i][1] > A[i+1][1]):
        
        
        