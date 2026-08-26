class Solution {
    public static String shortestBeautifulSubstring(String s, int k) {
        int n = s.length(), left = 0, ones = 0;
        String result = "";
        for (int right = 0; right < n; right++) {
            if (s.charAt(right) == '1') {
                ones++;
            }
            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }
            while (ones == k && left <= right && s.charAt(left) == '0') {
                left++;
            }
            if (ones == k) {
                String current = s.substring(left, right + 1);
                if (result.isEmpty() || current.length() < result.length()
                        || (current.length() == result.length()
                                && current.compareTo(result) < 0)) {
                    result = current;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String s = "1001001001100101011";
        int k = 4;
        System.out.print("The smallest beautiful string is : " + shortestBeautifulSubstring(s, k));
    }
}