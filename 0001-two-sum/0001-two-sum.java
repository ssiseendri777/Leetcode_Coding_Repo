import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> watch = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int c_das = target - nums[i];
            if(watch.containsKey(c_das)){
                return new int[]{watch.get(c_das),i};
            }
            watch.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] numbers ={22,77,45,67,2,3,47,7,8,54,33};
        int target = 99;
        int[] result = twoSum(numbers, target);
        System.out.print("[" + result[0] + "," + result[1] + "]");
    }
}