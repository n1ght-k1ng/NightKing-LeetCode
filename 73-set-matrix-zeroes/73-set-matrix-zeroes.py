# class Solution:
#     def setZeroes(self, matrix: List[List[int]]) -> None:
#         """
#         Do not return anything, modify matrix in-place instead.
#         """
        
        
#         nr = len(matrix)
#         nc = len(matrix[0])
        
#         first_row_has_zero = False
#         first_col_has_zero = False
#         for i in range(0,nr):
#             for j in range(0,nc):
#                 if matrix[i][j] == 0:
#                     if i == 0:
#                         first_row_has_zero = True
#                     if j == 0:
#                         first_col_has_zero = True 

#                     matrix[i][0] = matrix[0][j] = 0
        
#         for row in range(1,nr):
#             for col in range(1,nc):
#                 matrix[row][col] = 0 if matrix[0][col] == 0 or matrix[row][0] == 0 else matrix[row][col]
                
#         if(first_row_has_zero):
#             for row in range(nr):
#                 matrix[row][0] = 0
                
#         if first_col_has_zero:
#             for col in range(nc):
#                 matrix[0][col] = 0
        
#         return matrix
                
            
                
                
#         return matrix
       
                
                
                    
                    
                    
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:

        m = len(matrix)
        n = len(matrix[0])
		
        first_row_has_zero = False
        first_col_has_zero = False
        
        # iterate through matrix to mark the zero row and cols
        for row in range(m):
            for col in range(n):
                if matrix[row][col] == 0:
                    if row == 0:
                        first_row_has_zero = True
                    if col == 0:
                        first_col_has_zero = True
                    matrix[row][0] = matrix[0][col] = 0
    
        # iterate through matrix to update the cell to be zero if it's in a zero row or col
        for row in range(1, m):
            for col in range(1, n):
                matrix[row][col] = 0 if matrix[0][col] == 0 or matrix[row][0] == 0 else matrix[row][col]
        
        # update the first row and col if they're zero
        if first_row_has_zero:
            for col in range(n):
                matrix[0][col] = 0
        
        if first_col_has_zero:
            for row in range(m):
                matrix[row][0] = 0
                
        return matrix
        
            
                    
                    
                
        