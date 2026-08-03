import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int ori = x;
        int rev = 0;
        while(x!=0){
            int unit_digit = x % 10;
            rev =  rev * 10 + unit_digit;
            x /= 10;
        }
        return ori == rev;
    }
    public static void main(String[] args){
        int x;
        System.out.println("Enter an integer  : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("The entered number is a Palindrome : " + isPalindrome(x));
    } 
}