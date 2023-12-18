class Solution {
        private boolean isValidSubGrid(char[][] board, int startRow, int startCol) {
        HashMap<Character, Boolean> subGridMap = new HashMap<>();

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char currentChar = board[i][j];

                if (currentChar != '.') {
                    if (subGridMap.getOrDefault(currentChar, false)) {
                        return false;
                    }
                    subGridMap.put(currentChar, true);
                }
            }
        }

        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        
        HashMap <Integer, Boolean> row = new HashMap<>();
        
        boolean rowsValidated = false;
        for(int i = 0 ; i<9 ; i++){
            HashMap<Character, Integer> rowNums = new HashMap<>();
            HashMap<Character ,Integer> colNums = new HashMap<>();
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] != '.'){
                if(!rowNums.containsKey(board[i][j]))
                    rowNums.put(board[i][j], 1);
                else
                    return false;
                }
                if(board[j][i] !='.'){
                if(!colNums.containsKey(board[j][i])){
                    colNums.put(board[j][i], 1);
                }else{
                    System.out.println("col false" + i + " " + j + " " + board[i][j]);
                    return false;
                }
                    
                }}}
                for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubGrid(board, i, j)) {
                    return false;
                }
            }
        }
           

        return true;
    }
}