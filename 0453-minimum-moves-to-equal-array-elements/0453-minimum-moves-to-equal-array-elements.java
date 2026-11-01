class Solution {
    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        // finding the minimum element from the array
        for(int num : nums){
            min = Math.min(num, min);
        }
        int moves = 0;
        // summing all the moves
        for(int num : nums){
            moves += (num-min);
        }
        return moves;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println("The minimum number of moves reqired to make all array element equal is " + minMoves(nums));
    }
}