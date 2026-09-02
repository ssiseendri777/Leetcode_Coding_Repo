class Solution {
    public static boolean uniformArray(int[] nums1) {
        /* 
        always true because for 3 cases
        if all are odd then it is already valid
        if all are even then it is already valid
        if there is both odd or even then
        substract a odd number from every even element gives odd 
        which eventually will be valid 
        */

        return true;
        /*
        odd - odd = even
        even - even = even
        odd - even = odd
        even - odd = odd (case 3 used)
        */
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 4, 5 };
        System.out.println("is a uniform parity array possible : " + uniformArray(nums1));
    }
}