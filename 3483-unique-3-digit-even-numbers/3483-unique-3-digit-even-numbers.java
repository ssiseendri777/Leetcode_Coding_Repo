class Solution {
    public static int totalNumbers(int[] digits) {
        int result = 0, n = digits.length;
        /* created a boolean array og 1000 because of total 3 digit number
        also check if the number is repeating or not */
        boolean[] values = new boolean[1000];
        for (int i = 0; i < n; i++) {
            //  the first digit cannot be 0
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                // the same index digit should not be repeated
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    // the same index number should not be repeated also last should not be a odd digit
                    if (k == i || k == j || digits[k] % 2 == 1) {
                        continue;
                    }
                    // calculate the number
                    int value = (digits[i] * 100) + (digits[j] * 10) + (digits[k]);
                    // the number is repeated if not set true for future use
                    if (!values[value]) {
                        values[value] = true;
                        // increase the counter because its a distinct digit
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 1, 5, 7, 9 };
        System.out.println("The number of distinct three digit even numbers that can be formed : " + totalNumbers(arr));
    }
}