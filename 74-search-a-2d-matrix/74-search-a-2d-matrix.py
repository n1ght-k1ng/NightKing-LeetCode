class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        rows = len(matrix)
        cols = len(matrix[0])
        search_el_row = 0
        for i in range(0,rows-1):
            if(target > matrix[i][0] and target < matrix[i+1][0]):
                
                search_el_row = i
            if(target == matrix[i+1][0]):
                return True
        for i in range(cols):
            if(matrix[rows-1][i] == target):
                return True
        for i in range(0,cols):
            if(target == matrix[search_el_row][i]):
                return True
        return False
        