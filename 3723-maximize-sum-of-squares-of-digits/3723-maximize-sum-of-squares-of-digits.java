class Solution {
    public static String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int remainder = sum % 9;
        int _9s = sum / 9;
        for (int i = 0; i < _9s; i++) {
            result.append('9');
        }
        if (remainder > 0) {
            result.append((char) ('0' + remainder));
        }
        int _0s = num - result.length();
        for (int i = 0; i < _0s; i++) {
            result.append('0');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int num = 9;
        int sum = 27;
        System.out.println("The good integer n that has maximum score is " + maxSumOfSquares(num, sum));
    }
}