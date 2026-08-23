class Solution {
    public static boolean sumGame(String num) {
        int length = num.length(), half = length / 2, diff = 0, right = 0, left = 0;
        for (int i = 0; i < half; i++) {
            if (num.charAt(i) == '?') {
                left++;
            } else {
                diff += num.charAt(i) - '0';
            }
        }
        for (int i = half; i < length; i++) {
            if (num.charAt(i) == '?') {
                right++;
            } else {
                diff -= num.charAt(i) - '0';
            }
        }
        if ((left + right) % 2 == 1) {
            return true;
        }
        return diff != 9 * (right - left) / 2;

    }

    public static void main(String[] args) {
        String num1 = "??2345?90?";
        System.out.println("Winner " + (sumGame(num1) ? "Alice" : "Bob"));
    }
}