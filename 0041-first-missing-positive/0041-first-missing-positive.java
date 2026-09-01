class Solution {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            while (nums[i] >= 1 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return (n + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, -1, -2, 7, 8, 9 };
        System.out.println("The smallest positive integer missing is : " + firstMissingPositive(arr));
    }
}