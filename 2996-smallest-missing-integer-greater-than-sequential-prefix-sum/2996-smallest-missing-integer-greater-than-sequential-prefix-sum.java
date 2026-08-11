import java.util.HashSet;

class Solution {
    public static int missingInteger(int[] nums) {
        int key = nums[0];
        int j = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (j<n && nums[j] == nums[j - 1] + 1) {
                key += nums[j++];
            } else {
                break;
            }
        }
        HashSet<Integer> store = new HashSet<>();
        for (int i = 0; i < n; i++) {
            store.add(nums[i]);
        }

        int result = key;
        while (store.contains(result)) {
            result++;
        }
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 12, 13, 14, 15, 17, 56, 67, 89, 54 };
        int result = missingInteger(arr);
        System.out.print("The samllest integer missing from array is : " + result);

    }
}