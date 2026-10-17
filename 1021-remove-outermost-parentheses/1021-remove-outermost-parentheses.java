class Solution {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (count > 0) {
                    result.append(s.charAt(i));
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(s.charAt(i));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()(()))()(()())()(()(()))";
        System.out.println("The Output is : " + removeOuterParentheses(s));
    }
}