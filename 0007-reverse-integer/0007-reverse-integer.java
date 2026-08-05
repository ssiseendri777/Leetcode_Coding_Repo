import java.util.Scanner;
class Solution {
    public static int reverse(int x) {
        int reverse_int = 0;
        while(x != 0){
            int Unit_digit = x % 10;
            x /= 10;
            if(reverse_int > Integer.MAX_VALUE / 10 || (reverse_int == Integer.MAX_VALUE / 10 && Unit_digit > 7)){
                return 0;
            }
            if(reverse_int < Integer.MIN_VALUE / 10 || (reverse_int == Integer.MIN_VALUE / 10 && Unit_digit < -8)){
                return 0;
            }
            reverse_int = reverse_int * 10 + Unit_digit;
        }
        return reverse_int;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer that you want to reverse : " );
        int Original_int = sc.nextInt();
        int Reverse_int = reverse(Original_int);
        System.out.println("The reverse of the integer " + Original_int + " is : " + Reverse_int);
        sc.close();
    }
}