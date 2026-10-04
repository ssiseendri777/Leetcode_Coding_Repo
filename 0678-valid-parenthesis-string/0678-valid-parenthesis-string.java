class Solution {
    public static boolean checkValidString(String s) {
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                left--;
            }
            if (s.charAt(i) == ')') {
                right--;
            } else {
                right++;
            }
            if (right < 0)
                return false;
            left = Math.max(left, 0);
        }
        return left == 0;
    }

    public static void main(String[] args) {
        String s = "((*))(*)(*)(((*)))";
        System.out.println("Is the String is valid : " + checkValidString(s));
    }
}