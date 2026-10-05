class Solution {
    public static int scoreOfParentheses(String s) {
        int score = 0, depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // increasing the depth
                depth++;
            } else {
                depth--;
                if (s.charAt(i - 1) == '(') {
                    // adding the 2^depth-1 if previous is "(" to score  
                    score += 1 << depth;
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        String s = "((()((()))())(()))";
        System.out.println("The Score of the Parentheses is : " + scoreOfParentheses(s));
    }
}