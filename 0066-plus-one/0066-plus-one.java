class Solution {
    public static int[] plusOne(int[] digits) {
        int m = digits.length - 1;
        if (digits[m] == 9) {
            while (m >= 0 && digits[m] == 9) {
                digits[m] = 0;
                m--;
            }
            if (m < 0) {
                int[] updateddigits = new int[digits.length + 1];
                updateddigits[0] = 1;
                return updateddigits;

            } else {
                digits[m] += 1;
            }

        } else {
            digits[m] += 1;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 9, 9, 9 };
        int[] result = plusOne(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}