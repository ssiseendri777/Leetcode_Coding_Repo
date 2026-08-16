class Solution {
    public static int tribonacci(int n) {
        if (n == 2 || n == 1)
            return 1;
        if (n <= 0 || n > 37)
            return 0;
        int prev3 = 0, prev2 = 1, prev1 = 1;
        for (int i = 3; i <= n; i++) {
            int current = prev3 + prev2 + prev1;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.print("the " + n + "-th tribonacci number is " + tribonacci(n));
    }
}