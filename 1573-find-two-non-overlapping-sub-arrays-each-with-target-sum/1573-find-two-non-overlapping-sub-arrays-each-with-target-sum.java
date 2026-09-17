class Solution {
    public static int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int result = n + 1;
        int sum = 0;
        int[] dparray = new int[n + 1];
        Arrays.fill(dparray, n);
        for (int left = 0, right = 0; right < n; right++) {
            sum += arr[right];
            while (sum > target) {
                sum -= arr[left++];
            }
            dparray[right + 1] = dparray[right];
            if (sum == target) {
                result = Math.min(result, right - left + 1 + dparray[left]);
                dparray[right + 1] = Math.min(dparray[right], right - left + 1);
            }
        }
        return result ==  n + 1 ? -1 : result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 2, 3, 1, 4, 2, 5 };
        int k = 5;
        System.out
                .print("The minimum sum of the lengths of the two required sub-arrays is : " + minSumOfLengths(arr, k));
    }
}