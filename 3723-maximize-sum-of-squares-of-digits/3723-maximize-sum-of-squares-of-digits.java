class Solution {
    public static String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        while(num-- > 0){
            int digit = Math.min(9,sum);
            result.append(digit);
            sum -= digit;
        }
        return sum == 0 ? result.toString() : "";
    }

    public static void main(String[] args) {
        int num = 9;
        int sum = 27;
        System.out.println("The good integer n that has maximum score is " + maxSumOfSquares(num, sum));
    }
}