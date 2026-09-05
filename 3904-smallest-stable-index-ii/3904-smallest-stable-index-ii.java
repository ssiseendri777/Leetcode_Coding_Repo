class Solution {
    public static int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] minstableindex = new int[n];
        int min = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            min = Math.min(min, nums[i]);
            minstableindex[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            int pre = max - minstableindex[i];            
            if (pre <= k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 78, 9, 8, -1, -2, -11, 90 };
        int k = 6;
        System.out.println("The Smallest Stable Index Is : " + firstStableIndex(arr, k));
    }
}