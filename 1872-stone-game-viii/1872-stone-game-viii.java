class Solution {
    public static int stoneGameVIII(int[] stones) {
        int n = stones.length;
        // prefix sum conversion of stones
        for(int i = 1; i< n;i++){
            stones[i] += stones[i-1];
        }
        // condition alice can take all stones
        int dp = stones[n-1];
        // check better prefix from right to left 
        for(int i = n-2;i>0;i--){
            // current gain = dp 
            // opponents best advantage = stones[i] - dp
            dp = Math.max(dp,stones[i]-dp);
            // keeping the better option
        }
        return dp;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -1, -3, 4, -10, -6, 19, 6, 8 };
        System.out.print("Output : " + stoneGameVIII(arr));
    }
}