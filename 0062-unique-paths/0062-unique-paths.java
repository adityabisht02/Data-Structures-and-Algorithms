class Solution {
    
    public int dfs(int m,int n,int r,int c,int dp[][]){
        if(r>=m || c>=n){
            return 0;
        }
        if(r==m-1 && c==n-1){
            return 1;
        }
        if(dp[r][c]!=0){
            return dp[r][c];
        }        
        return dp[r][c]=dfs(m,n,r+1,c,dp)+dfs(m,n,r,c+1,dp);
        
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        
        int paths=dfs(m,n,0,0,dp);
        return paths;
    }
}