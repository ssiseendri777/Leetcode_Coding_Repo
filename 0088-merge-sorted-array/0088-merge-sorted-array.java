class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j--];
            } else {
                nums1[k] = nums1[i--];
            }
            k--;
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 0, 0, 0, 0 };
        int[] arr2 = { 2, 4, 5, 7 };
        merge(arr1, arr1.length - 4, arr2, arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}