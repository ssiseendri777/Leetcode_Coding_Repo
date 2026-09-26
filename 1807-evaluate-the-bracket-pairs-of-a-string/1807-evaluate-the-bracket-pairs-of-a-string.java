import java.util.HashMap;
import java.util.List;
import java.util.*;

class Solution {
    public static String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> updatewords = new HashMap<>();
        for (List<String> known : knowledge) {
            updatewords.put(known.get(0), known.get(1));
        }
        boolean isadded = false;
        StringBuilder oldword = new StringBuilder();
        StringBuilder resultstring = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == '(') {
                isadded = true;
            } else if (chr == ')') {
                if (updatewords.containsKey(oldword.toString())) {
                    resultstring.append(updatewords.get(oldword.toString()));
                } else {
                    resultstring.append('?');
                }
                isadded = false;
                oldword.setLength(0);
            } else if (isadded) {
                oldword.append(chr);
            } else {
                resultstring.append(chr);
            }
        }
        return resultstring.toString();
    }

    public static void main(String[] args) {
        String s = "(he) (will) (call) me";
        List<List<String>> list = Arrays.asList(
                Arrays.asList("he", "she"),
                Arrays.asList("will", "would"),
                Arrays.asList("call", "approach"));
        System.out.println("The new string " + evaluate(s, list));
    }
}