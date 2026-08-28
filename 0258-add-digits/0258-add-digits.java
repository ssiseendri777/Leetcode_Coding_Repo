class Solution {
    public static int addDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + (num - 1) % 9; 
    }

    public static void main(String[] args) {
        int num = 54673;
        System.out.println("The Digit sum of " + num + " is : " + addDigits(num));
    }
}