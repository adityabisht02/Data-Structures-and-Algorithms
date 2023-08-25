class Solution {
    public int rec(int n,int dp[]){
        if(n<=1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=rec(i-1,dp)*rec(n-i,dp);
        }
        return dp[n]=ans;
    }
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        return rec(n,dp);
    }
}