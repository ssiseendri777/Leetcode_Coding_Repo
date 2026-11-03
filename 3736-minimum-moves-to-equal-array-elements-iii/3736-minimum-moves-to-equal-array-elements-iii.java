class Solution {
    public static int minMoves(int[] nums) {
        int maximum = nums[0];
        for (int num : nums) {
            maximum = Math.max(num, maximum);
        }
        int moves = 0;
        for (int num : nums) {
            moves += maximum - num;
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 3, 1, 6, 8, 9 };
        System.out.println("The minimum number of moves required is " + minMoves(nums));
    }
}