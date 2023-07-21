class Solution {
    public int lis(int nums[],int index,int prevIndex,int dp[][]){
        if(index>=nums.length){
            return 0;
        }
        if(dp[index][prevIndex+1]!=-1){
            return dp[index][prevIndex+1];
        }
        //not take
        int leave=lis(nums,index+1,prevIndex,dp);
        //take
        int take=0;
        if(prevIndex==-1 || nums[prevIndex]<nums[index]){
           
            take=1+lis(nums,index+1,index,dp);
        }
        return dp[index][prevIndex+1]=Math.max(take,leave);
    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return lis(nums,0,-1,dp);
    }
}