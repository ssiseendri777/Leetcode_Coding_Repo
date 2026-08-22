class Solution {
    public static boolean checkDivisibility(int n) {
        int m = n;
        int i = 0;
        int j = 1;
        while(n!=0){
            int digit = n%10;
            i += digit;
            j *= digit;
            n /= 10;
        }
        if(m%(i+j) == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n = 99;
        int m = 23;
        int j = 111;
        System.out.println("for value "+n+" : "+checkDivisibility(n));
        System.out.println("for value "+m+" : "+checkDivisibility(m));
        System.out.println("for value "+j+" : "+checkDivisibility(j));
    }

}