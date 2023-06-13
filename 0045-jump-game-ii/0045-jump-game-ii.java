class Solution {
    public int rec(int nums[],int index,int dp[]){
        if(index>=nums.length-1){
            return 0;
        }
        if(dp[index]!=0){
            return dp[index];
        }
        int n=nums[index];
        if(n==0){
            dp[index]=-1;
            return -1;
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int res=rec(nums,index+i,dp);
            if(res==-1){
                continue;
            }
            int steps=1+ res;
            if(steps<min){
                min=steps;
            }
        }
        if(min==Integer.MAX_VALUE){
            dp[index]=-1;
            return -1;
        }
        dp[index]=min;
        return min;
    }
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
       
        return rec(nums,0,dp);
    }
}