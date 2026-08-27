class Solution {
    public static String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : target.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i = target.length() - 1; i >= 0; i--) {
            int current = target.charAt(i) - 'a';
            count[current]++;

            boolean flag = true;
            for (int x : count) {
                if (x < 0) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                continue;
            }
            int next = -1;
            for (int m = current + 1; m < 26; m++) {
                if (count[m] > 0) {
                    next = m;
                    break;
                }
            }
            if (next == -1) {
                continue;
            }
            count[next]--;
            StringBuilder result = new StringBuilder(target.substring(0, i));
            result.append((char) ('a' + next));
            for (int n = 0; n < 26; n++) {
                while (count[n]-- > 0) {
                    result.append((char) ('a' + n));
                }
            }
            return result.toString();

        }
        return "";
    }

    public static void main(String[] args) {
        String s = "caller", target = "passed";
        System.out.print("The lexicographically smallest permutation is : " + lexGreaterPermutation(s, target));
    }
}