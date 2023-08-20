class Solution {
    public int helper(int arr[],int left,int dp[]){
        if(left==0){
            return 0;
        }
        if(dp[left]!=0){
            return dp[left];
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(left-arr[i]>=0){
                
               int res= helper(arr,left-arr[i],dp);
                if(res!=-1){
                     min=Math.min(min,res+1);
                }               
            }
        }
        return dp[left]=(min==Integer.MAX_VALUE)?-1:min;
    }
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,0);
        return helper(coins,amount,dp);
    }
}