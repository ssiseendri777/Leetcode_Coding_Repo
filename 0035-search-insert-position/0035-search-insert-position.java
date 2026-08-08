class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        if (nums[left] > target) {
            return 0;
        }
        if (nums[right] < target) {
            return right + 1;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] sort_arr = { 0, 1, 2, 3, 4, 5, 6, 7, 23, 45, 67, 89 };
        int target_element = 56;
        int Result = searchInsert(sort_arr, target_element);
        System.out.print("Index : " + Result);
    }
}