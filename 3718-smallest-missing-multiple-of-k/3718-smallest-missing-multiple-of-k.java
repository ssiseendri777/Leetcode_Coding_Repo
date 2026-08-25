import java.util.HashSet;
import java.util.*;

class Solution {
    public static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> arr = new HashSet<>();
        for(int num : nums){
            if(num > 0 && num % k == 0){
                arr.add(num);
            }
        }
        int candidate = k;
        while(arr.contains(candidate)){
            candidate += k;
        }
        return candidate;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,8,10,12};
        int k = 2;
        System.out.println("The smallest positive multiple of " + k + " is : " + missingMultiple(arr, k));
    }
}