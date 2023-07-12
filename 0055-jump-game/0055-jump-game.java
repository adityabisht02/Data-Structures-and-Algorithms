class Solution {
    public boolean rec(int nums[],int index,int dp[]){
        if(index>=nums.length-1){
            return true;
        }
        if(dp[index]!=-1){
            if(dp[index]==1){
                return true;
            }
            return false;
        }
        int length=nums[index];
        
        for(int i=1;i<=length;i++){
            boolean res=rec(nums,index+i,dp);
            if(res){
                dp[index]=1;
                return true;
            }
        }
        dp[index]=0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return rec(nums,0,dp);
    }
}