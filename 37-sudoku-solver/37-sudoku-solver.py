import math
class Solution:
    
    def isSafe(self, board , row , col , num):
        for i in range(len(board)): # check row
            if board[row][i] == str(num):
                return False
        for x in board:
            if x[col] == str(num):
                return False
        sqt = math.sqrt(len(board)) 
        sqt = int(sqt)
        rowstr = row - row % sqt
        colstr = col - col % sqt
        rowstr = int(rowstr)
        colstr = int(colstr)
        for r in range(rowstr,rowstr+sqt):
            for c in range(colstr,colstr+sqt):
                if board[r][c] == str(num) : 
                    return False
        return True
    def solveSudoku(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        self.solve(board)
        
    def solve(self,board):
        
        n = len(board)
        row = -1 
        col = -1 
        emptyleft = True 
        for i in range(n):
            for j in range(n):
                if board[i][j] == '.':
                    row = i 
                    col = j
                    emptyleft = False
                    break;
            if emptyleft == False:
                break
        # print(row , col)
        if emptyleft == True:
            return True
        
        for i in range(1,10):
            if self.isSafe(board,row,col,i):
                board[row][col] = str(i)
                if self.solve(board):
                    return True
                else:
                    board[row][col] = '.' # this is backtracking
                    
        return False
        