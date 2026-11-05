class Solution {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for (int num1 : arr1) {
            boolean id = true;
            for (int num2 : arr2) {
                id &= Math.abs(num1 - num2) > d;
            }
            count += id ? 1 : 0;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 8 };
        int[] arr2 = { 10, 8, 9 };
        int d = 3;
        System.out.println("The output " + findTheDistanceValue(arr1, arr2, d));
    }
}