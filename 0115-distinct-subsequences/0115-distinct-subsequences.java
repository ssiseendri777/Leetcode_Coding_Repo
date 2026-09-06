class Solution {
    public static int numDistinct(String s, String t) {
        int n = s.length(), m = t.length();
        if (n < m) {
            return 0;
        }
        // empty dp table
        int[][] dptable = new int[n + 1][m + 1];
        // initially assign 1 to last column
        for (int i = 0; i <= n; i++) {
            dptable[i][m] = 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            char c_s = s.charAt(i);
            for (int j = m - 1; j >= 0; j--) {
                char c_t = t.charAt(j);
                if (c_s == c_t) {
                    dptable[i][j] = dptable[i + 1][j + 1] + dptable[i + 1][j];
                } else {
                    dptable[i][j] = dptable[i + 1][j];
                }
            }
        }
        return dptable[0][0];
    }

    public static void main(String[] args) {
        String s = "murmur", t = "mu";
        System.out.println(
                "The Distinct Subsequences of " + s + " which is equals to " + t + " is : " + numDistinct(s, t));
    }
}