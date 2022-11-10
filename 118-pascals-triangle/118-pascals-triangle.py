class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        
            
        
        arr = [0]*numRows
        
        for i in range(numRows):
            arr[i] = [0]*(i+1)
            arr[i][0] = 1
            arr[i][i] = 1
            for j in range(1,i):
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j]
                    
                
        
        return arr
    
    
#     class Solution:
#     def generate(self, numRows: int) -> List[List[int]]:
#         l=[0]*numRows
#         for i in range(numRows):
#             l[i]=[0]*(i+1)
#             l[i][0]=1
#             l[i][i]=1
#             for j in range(1,i):
#                 l[i][j]=l[i-1][j-1]+l[i-1][j]
#         return l
        
        

        
        
        
        
#         # arr = [[0]*numRows]*numRows # created a dda square list
#         # for i in range(0,len(arr)):
#         #     if(i == (len(arr)//2)):
#         #         arr[i][len(arr)/2] = 1
#         # for i in range()