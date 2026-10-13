class Solution {
    public static long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        long ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                ans -= nums[i];
            } else {
                ans += nums[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -2, -1, 3, 5, 6, 7, 8 };
        System.out.println("The maximum possible alternating score of arr is " + maxAlternatingSum(arr));
    }
}