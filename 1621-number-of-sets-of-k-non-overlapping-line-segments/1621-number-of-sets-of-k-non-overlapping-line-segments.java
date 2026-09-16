import java.math.BigInteger;
class Solution {
    // used BigInteger Because of compiler error
    public static BigInteger MOD = BigInteger.valueOf(1000000007L);

    public static int numberOfSets(int n, int k) {
        /*
        the total number of sets are 
                        (n + k - 1)
                        |         |
                        (    2k   )
                (n + k - 1) C (2k)   combinations
        */
        int N = n + k - 1;
        int R = 2*k;
        if((N-R) < R){
            R = N - R;
        }
        return combination(N,R).mod(MOD).intValue(); // convert the BigInteger to int
    }
    // used BigInteger because long Limit Exceeded
    public static BigInteger combination(int N, int R) {
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < R; i++) {
            result = result.multiply(BigInteger.valueOf(N-i));
            result = result.divide(BigInteger.valueOf(i+1));
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 8, k = 3;
        System.out.print("The number of ways we can draw k non_overlapping line segments : "
                + numberOfSets(n, k));
    }
}