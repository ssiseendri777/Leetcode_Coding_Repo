class Solution {

        public static int removeDuplicates(int[] nums) {
       int i, j = 0;
       for(i = 0; i < nums.length-1; i++){
        if(nums[j]!= nums[i+1]){
            j++;
            nums[j]=nums[i+1];
        }
       }
       printArray(nums, j+1);
       return j+1;
    }
        public static void printArray(int[] nums, int length) {
        for(int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
        }
    }
        public static void main(String[] args){
        int [] nums = {0,0,1,2,2,2,3,3,3,4,5,6,6,7,8};
        System.out.print("Array after removing duplicates: ");
        int result = removeDuplicates(nums);
        System.out.println("\nLength of array after removing duplicates: " + result);
        

    }
}