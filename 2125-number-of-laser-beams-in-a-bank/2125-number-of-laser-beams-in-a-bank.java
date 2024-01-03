class Solution {
    public int itHasOne(int [] arr){
        int count = 0 ;
        for(int i : arr){
            if(i==1){
                count++;
            }
        }
        return count;
    }
    
    public static int[][] convertStringTo2DArray(String[] stringArray) {
        int numRows = stringArray.length;
        int numCols = stringArray[0].length(); // Assuming all rows have the same length

        int[][] resultArray = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                resultArray[i][j] = Character.getNumericValue(stringArray[i].charAt(j));
            }
        }

        return resultArray;
    }

    
    public int numberOfBeams(String[] bankk) {
        
        int rows = 0;
        int i = 0;
        int count = 0;
        int[][] bank = convertStringTo2DArray(bankk);
        for(i =0 ; i < bank.length - 1; i++)
        {
            rows = itHasOne(bank[i]);
            if(itHasOne(bank[i]) > 0)
                break;    
        }
        
        for(i = i +1 ; i < bank.length ; i++){
            int present = itHasOne(bank[i]);
            if(present == 0){
                continue;
            }
            
            count = count + (rows * present);
            rows = present;
        }
        
        return count ;
        
    
    }
}