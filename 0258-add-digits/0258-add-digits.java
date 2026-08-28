class Solution {
    public static int addDigits(int num){
        int result = 0;
        while(num != 0){
            result += (num % 10);
            num /= 10;
            if(num == 0 && result > 9){
                num = result;
                result = 0;                
            }
        }
        return result;
    }
    public static void main(String[] args){
        int num = 54673;
        System.out.println("The Digit sum of "+num+" is : "+addDigits(num));
    }
}