class Solution {
    public int[] runningSum(int[] nums) {
        int dp[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(i==0){
                dp[i]=nums[i];
            }
            else{
                dp[i]=nums[i]+dp[i-1];
            }
        }
        
        return dp;
    }
}