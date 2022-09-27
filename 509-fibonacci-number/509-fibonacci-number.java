class Solution {
    public int rec(int dp[],int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=rec(dp,n-1)+rec(dp,n-2);
    }
    
    public int fib(int n) {
       if(n==0 || n==1){
           return n;           
       }
        int dp[]=new int[n+1];
       return rec(dp,n);
        
    }
}