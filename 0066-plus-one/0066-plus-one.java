// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// class Solution {
//     public int[] plusOne(int[] digits) {
//         List<Integer> res= new ArrayList<>();
//         for (int value : digits) {
//             res.add(value);
//         }
        
//         for(int i = res.size()-1 ; i >=0 ; i--){
//             if(res.get(i)!=9){
//                 int temp = res.get(i);
//                 res.set(i,temp+1);
//                 break;
//             }else{
//                 res.set(i,0);
//             }
//         }
        
//         if(res.get(0) == 0 && digits[0] != 0){
//             res.add(0,1);
//         }
//         int[] ret = new int[res.size()];
//         for (int i = 0; i < res.size(); i++) {
//             ret[i] = res.get(i);
//         }
//         return ret;
//     }
// }
class Solution {
    public int[] plusOne(int[] digits) {
for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }}