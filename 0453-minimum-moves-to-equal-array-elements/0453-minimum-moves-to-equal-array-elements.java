class Solution {
    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;
        // total number of moves 
        for (int num : nums) {
            min = Math.min(num, min);
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