# class Solution:
#     def isSafe(self,board,row,col,n)-> bool:
 
#         for i in range(row):
#             if board[i][col] == 'Q':
#                 return False
            
#         maxleft = min(row,col)
#         for i in range(1,maxleft+1):
#             if board[row-i][col-i] == 'Q':
#                 return False
#         maxright = min(row,n-col-1)
#         for i in range(1,maxright+1):
#             if board[row-i][col+i] == 'Q':
#                 return False
#         return True                 
#     def Nqueens(self,board,row,ans,n):
#         if row == n:
#             ans.append(["".join(i) for i in board])
#             print("yesss")
#             return
#         for col in range(0,n):
#             if (self.isSafe(board,row ,col,n)):
#                 board[row][col] = 'Q'
#                 self.Nqueens(board,row+1,ans,n)
#                 board[row][col] = '.'
        
                
#     def solveNQueens(self, n: int) -> List[List[str]]:
#         # self.boardcreate(n)
#         ans = [[]]
#         board = [['.']*n]*n
#         self.Nqueens(board,0,ans,n)
#         return ans

class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        def issafe(r,c):
            n = len(board)
            for i in range(n):
                if board[i][c] == 'Q':
                    return False
                if r - i >= 0 and c - i >= 0 and board[r-i][c-i] == 'Q':
                    return False
                if r - i >= 0 and c + i < n and board[r-i][c+i] == 'Q':
                    return False
            return True
                
        def solve(r):
            n = len(board)
            if r == n:
                print(board)
                ans.append(["".join(i) for i in board])
                return 
            for c in range(0,n):
                if issafe(r,c):
                    board[r][c] = 'Q'
                    solve(r+1)
                    board[r][c] = '.'
        board = [['.']*n for i in range(n)]
        ans =[]
        solve(0) 
        return ans