import java.util.HashMap;

class Solution {
    public static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max_length = 0;
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;

            }
            max_length = Math.max(max_length, right - left + 1);
        }

        return max_length;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 4, 5, 5, 6, 5, 6, 7, 2, 1 };
        int k = 2;
        int result = maxSubarrayLength(arr, k);
        System.out.print("The Longest possible good subarray length is : " + result);
    }
}