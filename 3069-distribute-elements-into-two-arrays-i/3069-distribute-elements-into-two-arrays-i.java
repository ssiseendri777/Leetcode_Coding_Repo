import java.util.*;

class Solution {
    public static int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        // First two operations
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        // Remaining operations
        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        // Concatenate arr1 and arr2
        int[] result = new int[arr1.size() + arr2.size()];
        int index = 0;
        for (int num : arr1) {
            result[index++] = num;
        }
        for (int num : arr2) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int num : arr) {
            System.out.print(num + " ");
        }
        int[] result = resultArray(arr);
        System.out.println();
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}