class Solution {

    public static int removeDuplicates(int[] nums) {
       int i, j = 0;
       for(i = 0; i < nums.length-1; i++){
        if(nums[j] != nums[i+1]){
            j++;
            nums[j]=nums[i+1];
        }
       }
       
       return j+1;
    }
    public static void PrintArray(int[] nums, int k){
        System.out.print("[");
        for(int i = 0; i < k; i++){
          System.out.print(nums[i] + ",");  
        }
        System.out.print("]");
    }    
    public static void main(String[] args){
        int [] nums = {1,2,2,2,3,3,3,4,5,6,6,7,8};
        System.out.print("Array after removing duplicates: ");
        int result = removeDuplicates(nums);
        PrintArray(nums, result); 
        System.out.println("\nLength of array after removing duplicates: " + result); 
    }
}