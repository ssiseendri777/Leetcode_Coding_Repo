class Solution {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves = 0, median = nums[nums.length / 2];
        for (int num : nums) {
            moves += Math.abs(num - median);
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 3, 4, 78, 9 };
        System.out
                .println("The minimum number of moves required to make all array elements equal is " + minMoves2(nums));
    }
}