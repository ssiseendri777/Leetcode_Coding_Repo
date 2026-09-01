class Solution {
    public static int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        for (int i = k; i <= k * (n + 1); i += k) {
            boolean flag = false;
            for (int num : nums) {
                if (num == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return i;
            }
        }
        return k * (n + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 8, 10, 12 };
        int k = 2;
        System.out.println("The smallest positive multiple of " + k + " is : " + missingMultiple(arr, k));
    }
}