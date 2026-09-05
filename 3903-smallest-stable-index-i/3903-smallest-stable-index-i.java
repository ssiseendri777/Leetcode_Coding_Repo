class Solution {
    public static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        // created the array to store the stable index for each index i of nums
        int[] stableindex = new int[n];
        // used to compare
        // used to compare
        int min = Integer.MAX_VALUE;
        // for each i it substract min(nums[i...n-1]) from the max(nums[0...i]) as per formula
        /* started from last index because 
            for min term if we see from right to left n-1 to 0...n-1 the number of index increases
            for i = 0 stable index = max(nums[0]) - min(nums[0..n - 1] ..... so on up to 
            for i = n-1 stable index = max(nums[0...n-1]) - min(nums[n - 1]
        */
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            stableindex[i] = min;
        }
        int max = Integer.MIN_VALUE;
        //stable index formula = max(nums[0..i]) - min(nums[i..n - 1])
        // for each i it stores the max(nums[0...i]) of the formula
        /* started from first index because
            for max term if we see from left to right 0 to 0...n-1 the number of index increases
            for i = 0 stable index = max(nums[0]) - min(nums[0..n - 1] ..... so on up to 
            for i = n-1 stable index = max(nums[0...n-1]) - min(nums[n - 1]
        */
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if ((max - stableindex[i]) <= k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 2, 8, -4, 7, -6 };
        int k = 4;
        System.out.println("The smallest stable index is : " + firstStableIndex(arr, k));
    }
}