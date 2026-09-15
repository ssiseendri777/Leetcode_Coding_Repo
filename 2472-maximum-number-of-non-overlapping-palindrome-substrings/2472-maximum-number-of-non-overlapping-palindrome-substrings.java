class Solution {
    public static int maxPalindromes(String s, int k) {
        int n = s.length();
        if (k == 1) {
            return n;
        }
        int result = 0;
        for (int i = 0; i <= n - k; i++) {
            if (palindromecheck(s, i, i + k - 1)) {
                result++;
                i += k - 1;
            } else if (i < n - k && palindromecheck(s, i, i + k)) {
                result++;
                i += k;
            }
        }
        return result;
    }
    // checks the substring is palindrome or not
    public static boolean palindromecheck(String s, int left, int right) {
        for (; left < right; left++, right--) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int k = 3;
        String word = "aadacdfghgf";
        System.out.print("The maximum number of substrings : " + maxPalindromes(word, k));
    }
}