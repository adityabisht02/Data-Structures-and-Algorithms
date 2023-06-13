class Solution {
    public boolean rec(int nums[],int index,int dp[]){
        if(index>=nums.length-1){
            return true;
        }
        if(dp[index]==1){
            return true;
        }
        if(dp[index]==0){
            return false;
        }
        int n=nums[index];
        //run a loop to make all possible jumps
        for(int i=1;i<=n;i++){
            boolean reachedEnd=rec(nums,index+i,dp);
            
            if(reachedEnd){
                dp[index]=1;
                return true;
            }
            
        }
        //if we cant reach end from this index through any number of steps, make this index false
        dp[index]=0;
        return false;
    }
    public boolean canJump(int[] nums) {
        //keeps track of whether we can reach end index from that particular index
        int dp[]=new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return rec(nums,0,dp);
    }
}