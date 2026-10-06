class Solution {
    public static int minAddToMakeValid(String s) {
        int openbracket = 0;
        int minimummoves = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                openbracket++;
            } else {
                if (openbracket > 0) {
                    openbracket--;
                    // if open bracket exist use them
                } else {
                    minimummoves++;
                    // no open bracket exist add them
                }
            }
        }
        return openbracket + minimummoves;
    }

    public static void main(String[] args) {
        String s = "(((((((((()))))))))))))))))))";
        System.out.println("The only the minimum number of moves required is : " + minAddToMakeValid(s));
    }
}