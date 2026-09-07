class Solution {
    static int MODULO = 1000000007;

    public static int distinctSubseqII(String s) {
        int count = 0;
        int[] dparray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 97;
            int n = (count - dparray[ch] + MODULO) % MODULO;

            dparray[ch] = 1 + count;
            count = (dparray[ch] + n) % MODULO;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "helloworld";
        System.out.println("The number of distinct non empty subsequences of " + s + " is " + distinctSubseqII(s));
    }
}