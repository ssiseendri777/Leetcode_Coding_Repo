import java.util.ArrayList;
import java.util.List;

class Solution {
    private static void generate(int open, int close, StringBuilder current, List<String> result){
        // Base condition
        if (open == 0 && close == 0) {
            result.add(current.toString());
            return;
        }
        // Add opening parenthesis
        if (open > 0) {
            current.append('(');
            generate(open - 1, close, current, result);
            // Backtracking
            current.deleteCharAt(current.length() - 1);
        }
        // Add closing parenthesis only if valid
        if (close > open) {
            current.append(')');
            generate(open, close - 1, current, result);
            // Backtracking
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        generate(n, n, current, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> result = generateParenthesis(n);
        System.out.println("Valid Parentheses for " + n + " : ");
        for (String s : result) {
            System.out.println(s);
        }
    }
}