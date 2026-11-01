class Solution {
    public static int minMoves(int[] nums) {
        int min = nums[0];
        int moves = 0;
        // total number of moves 
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
            // finding the minimum element from the array
            moves += num;
            // array sum
        }
        // formula moves = array sum - (minimum element * array length)
        return moves - (min * nums.length);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println("The minimum number of moves reqired to make all array element equal is " + minMoves(nums));
    }
}