class Solution {
    public int helper(int arr[],int index,int isBought,int dp[][]){
        if(index>=arr.length){
            return 0;
        }
        if(dp[index][isBought]!=0){
            return dp[index][isBought];
        }
        //if not bought
        if(isBought==0){
            //either buy or skip
            int buy=helper(arr,index+1,1,dp)-arr[index];
            int skip=helper(arr,index+1,0,dp);
            return dp[index][isBought]=Math.max(buy,skip);
        }
        //if bought we need to sell, either sell now or skip
        int sell=helper(arr,index+2,0,dp)+arr[index];
        int skip=helper(arr,index+1,1,dp);
        return dp[index][isBought]=Math.max(sell,skip);
    }
    public int maxProfit(int[] prices) {
        int dp[][]=new int[prices.length][2];
        return helper(prices,0,0,dp);
    
               
    }
}