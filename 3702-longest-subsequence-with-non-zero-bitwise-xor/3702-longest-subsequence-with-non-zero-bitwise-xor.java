class Solution {
    public static int longestSubsequence(int[] nums) {
        int count = 0, n = nums.length, xorvalue = 0;
        for (int x : nums) {
            xorvalue ^= x;
            if (xorvalue == 0)
                count++;
        }
        if (xorvalue != 0) {
            return n;
        }
        return (count == n) ? 0 : n - 1;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int result = longestSubsequence(array);
        System.out.print("the longest subsequence is " + result);
    }
}