class Solution {
    public int helper(int nums[],int index,int dp[]){
        if(index>=nums.length-1){
            return 0;
        }
        if(nums[index]==0){
            return dp[index]=-1;
        }
        if(dp[index]!=0){
            return dp[index];
        }
        int n=nums[index];
        int min=Integer.MAX_VALUE;
        int steps=-1;
        for(int i=1;i<=n;i++){
            int result=helper(nums,index+i,dp);
            if(result!=-1){
                if(result<min){
                    min=result;
                    steps=1+min;
                }
            }
        }
        return dp[index]=steps;
    }
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        return helper(nums,0,dp);
    }
}