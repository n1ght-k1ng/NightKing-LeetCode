class Solution {
    
    private static final long MOD = 1000000007;
    public long powres(long x, long n) {
        if (n == 0) {
            return 1;
        }

        long half = powres(x, n / 2);

        if (n % 2 == 0) {
            return (half * half) % MOD ;
        } else {
            return (half * half * x) % MOD;
        }
    }
    
        public int countGoodNumbers(long n) {
            long oddpl = n/2 ;
            long evenpl = (n+1)/2 ;
         return (int)(powres(4,oddpl) * powres(5,evenpl) %MOD);
    }
    
//     public Boolean isPrime(int n){
//         int count = 0;
//         for(int i = 1; i <=n; i ++){
//             if (n%i == 0)
//                 count++;
//         }
//         if (count == 2){
//             return true;
//         }
//         else{
//             return false;
//         }
        
//     }
    
//     public Boolean isEven(long n){
//         if (n %2 == 0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
    
//     public static int countDigits(long num) {
//         if (num == 0) {
//             return 1; // Special case for num = 0
//         }

//         int count = 0;
//         num = Math.abs(num); // Make sure the number is non-negative

//         while (num > 0) {
//             num = num / 10;
//             count++;
//         }

//         return count;
//     }
    
//     public int cgnfunc(long n){
//         Boolean even = isEven(n);
//         if (n == 0)
//             return 1
//         if (even == true){
//             return 4 * cgnfunc(n-1); 
//         }
//         else{
//             return 5 * cgnfunc(n-1);
//         }
        
//     }
    
    
    
        

}