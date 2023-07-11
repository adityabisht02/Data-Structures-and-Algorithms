class Solution {
    public int lis(int nums[],int index,int prevIndex,int dp[][]){
        if(index>=nums.length){
            return 0;
        }
        if(dp[index][prevIndex+1]!=-1){
            return dp[index][prevIndex+1];
        }
       
        int current=nums[index];
        //case where we take nums[index]
        //check if current is greater than prev
        int take=0;
        if(prevIndex==-1 || current>nums[prevIndex]){
             take=1+lis(nums,index+1,index,dp);
        }
        //case wher we leave nums[index]
        int leave=lis(nums,index+1,prevIndex,dp);
       
       return dp[index][prevIndex+1]=Math.max(leave,take);
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