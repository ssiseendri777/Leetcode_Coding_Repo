import java.util.*;

class Solution {
    public static boolean uniformArray(int[] nums1) {
        int min = nums1[0];
        boolean hasoddnum = false;
        for (int num : nums1) {
            min = Math.min(min, num);
            if ((num % 2) != 0) {
                hasoddnum = true;
            }
        }
        // minimum is odd then whole array can be odd
        if (min % 2 != 0) {
            return true;
        }
        // minimum is even:
        // if odd exist then the smallest odd cannot be even
        return !hasoddnum;
    }
}