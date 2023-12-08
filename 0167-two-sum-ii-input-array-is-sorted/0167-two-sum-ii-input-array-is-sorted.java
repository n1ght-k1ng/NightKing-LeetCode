class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int p1 = 0;
        int p2 = len-1;
        int arr[] = new int[2];
        for(int i = 0; i< len ; i++){
            int sum = numbers[p1]+numbers[p2];
            if(sum > target)
                p2--;
            else if(sum < target)
                p1++;
            else{
                arr[0] = p1+1;
                arr[1]= p2 +1;
                break;
            }
        }

        return arr;
    }
}