class Solution {
    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1)) == 0; 
        
    }
    public static void main(String[] args){
        int num = 128;
        System.out.print(num+" is the power of 2 "+isPowerOfTwo(num));
    }
}