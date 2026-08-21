class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String s = strs[0];
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int j = 0;
            char c = s.charAt(i);
            while(j<strs.length){
                if(i>= strs[j].length() || c != strs[j].charAt(i)){
                    return result.toString();
                }
                j++;
            }
            result.append(c);
        }
        return result.toString();      
    }
    public static void main(String[] args){
        String[] strs = {"fight","fine","fix"};
        String result = longestCommonPrefix(strs);
        System.out.print(result + " is the longest prefix of the array of strings");

    }
}