class Solution {
    public static String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        int _9s = sum / 9;
        sum %= 9;
        StringBuilder result = new StringBuilder("9".repeat(_9s));
        if (sum > 0) {
            result.append(sum);
        }
        result.append("0".repeat(num - result.length()));
        return result.toString();
    }

    public static void main(String[] args) {
        int num = 9;
        int sum = 27;
        System.out.println("The good integer n that has maximum score is " + maxSumOfSquares(num, sum));
    }
}