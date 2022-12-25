class Solution {
    public int rec(int i,int j,int m,int n,int dp[][]){
        //path found
        if(i==m-1 && j==n-1){
            return 1;
        }
        //out of bounds of matrix
        if(i>=m || j>=n){
            return 0;
        }
        //check if dp array already contains value
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        return dp[i][j]=rec(i+1,j,m,n,dp)+rec(i,j+1,m,n,dp);
        
    }    
    public int uniquePaths(int m, int n) {
        
        int dp[][]=new int[m][n];
        
        return rec(0,0,m,n,dp);
    }
}