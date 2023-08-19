class Solution {
    public int helper(int nums[],int index,int dp[]){
        if(index>=nums.length-1){
            return 0;
        }
        if(nums[index]==0){
            return -1;
        }
        if(dp[index]!=0){
            return dp[index];
        }
        int jump=nums[index];
        int min=-1 ;
        for(int i=1;i<=jump;i++){
            int res=helper(nums,index+i,dp);
            if(res==-1){
                continue;
            }
            if(res<min || min==-1){
                min=res;
            }
           
        }
        if(min==-1){
            return dp[index]=-1;
        }
        return dp[index]=1+min;
    }
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        return helper(nums,0,dp);
    }
}