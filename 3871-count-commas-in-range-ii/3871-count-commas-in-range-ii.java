class Solution {
    public static long countCommas(long n) {
        long countcomma = 0;
        if (n < 1000) {
            return countcomma;
        }
        for (long i = 1000; i <= n; i *= 1000) {
            countcomma += n - (i - 1);
        }
        return countcomma;
    }

    public static void main(String[] args) {
        long n = 1000000000000L;
        System.out.println("The total number of commas used in " + n + " is : " + countCommas(n));
    }
}