class Solution {
    public static int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int digitsum = 0;
            while (num > 0) {
                digitsum += num % 10;
                num = num / 10;
            }
            if (digitsum == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 121, 34, 45, 67, 88, 99, 23, 78, 17, 27, 37 };
        System.out.printf("The smallest index i such that digit sum of nums[i] == i is : " + smallestIndex(nums));
    }
}