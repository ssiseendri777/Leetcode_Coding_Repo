class Solution {
    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int result = 0, i = 0; // min swaps
        long[] array = new long[n];
        for (int num : nums) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            array[i] = ((long) sum) << 47 | ((long) nums[i] << 17) | i;
            i++;
        }
        Arrays.sort(array);
        for (int j = 0; j < n; j++) {
            if (array[j] >= 0) {
                int next = (int) (array[j] & 0x1FFFFL);
                array[j] = -1;
                while (array[next] >= 0) {
                    int temp = (int) (array[next] & 0x1FFFFL);
                    array[next] = -1;
                    next = temp;
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 34, 56, 78, 345, 789, 999, 234, 534, 8964 };
        System.out
                .println("The minimum number of swaps required to rearrange nums into sorted order " + minSwaps(nums));
    }
}