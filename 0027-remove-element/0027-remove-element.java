class Solution {
    public static int removeElement(int[] nums, int val) {
        int i, j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];

            }
        }
        return j;

    }

    public static void PrintArray(int[] nums, int length) {
        System.out.print("[ ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(" ]");
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 2, 4, 5, 3, 6, 7, 2, 8, 9, 2, 0, 1 };
        int delete_element = 2;
        int result = removeElement(arr, delete_element);
        PrintArray(arr, result);
    }

}