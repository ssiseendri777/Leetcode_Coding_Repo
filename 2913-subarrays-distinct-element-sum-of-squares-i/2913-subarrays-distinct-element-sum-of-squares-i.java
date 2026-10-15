import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public static int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int result = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                result += set.size() * set.size();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 8, 3, 3, 4, 5));
        System.out.println("The sum of the squares of distinct counts of all subarrays is " + sumCounts(arr));
    }
}