class Solution {
    public static int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        return n - 999;
    }
    public static void main(String[] args){
        int n = 99999;
        System.out.println("total numbers of comma used : "+countCommas(n));
    }
}