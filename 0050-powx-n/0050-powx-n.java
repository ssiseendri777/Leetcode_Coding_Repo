class Solution {
    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double j = 1;
        while (N != 0) {
            if (N % 2 == 1) {
                j *= x;
            }
            x *= x;
            N /= 2;
        }
        return j;
    }

    public static void main(String[] args) {
        double x = 2.000;
        int n = 3;
        double result = myPow(x, n);
        System.out.print(x + "^" + n + " = " + result);
    }

}