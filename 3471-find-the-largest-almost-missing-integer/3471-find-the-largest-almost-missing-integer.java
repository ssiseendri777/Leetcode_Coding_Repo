import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Collections;

class Solution {
    public static int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            HashSet<Integer> seen = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                seen.add(nums[j]);
            }
            for (int x : seen) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        int largestinteger = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                largestinteger = Math.max(largestinteger, entry.getKey());
            }
        }
        return largestinteger;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 9, 2, 1, 7, 4, 8, 9, 2, 1, 5, 0 };
        int k = 3;
        int result = largestInteger(arr, k);
        System.out.println("Largest Integer : " + result);
    }
}