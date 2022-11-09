class Solution:
    def maxSum(self, arr: List[List[int]]) -> int:
        nr = len(arr)
        nc = len(arr[0])
        maxx = 0 
        sum1= 0 
        for i in range(1,nr-1):
            for j in range(1,nc-1):
                
                sum1 = arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j] + arr[i+1][j+1]
                if(maxx < sum1):
                    maxx = sum1
                
        return maxx
        