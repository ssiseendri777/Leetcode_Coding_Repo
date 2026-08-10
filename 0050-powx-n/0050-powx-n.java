class Solution {
    public static double myPow(double x, int n) {
        long N = n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double j = 1;
        if(N>=0){
        while(N!=0){
            if((N&1)!=0){
                j*=x;
            }
            x*=x;
            N>>>=1;
        }
        }
    return j;    
    }
    public static void main(String[] args){
        double x = 2.000;
        int n = 3;
        double result = myPow(x,n);
        System.out.print(x+"^"+n+" = "+result);
    }
    
}