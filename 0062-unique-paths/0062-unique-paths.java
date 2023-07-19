class Solution {
    public int dfs(int r,int c,int m,int n,int dp[][]){
        if(r>=m || c>=n){
            return 0;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        if(r==m-1 && c==n-1){
            return 1;
        }
        return dp[r][c]=dfs(r+1,c,m,n,dp)+dfs(r,c+1,m,n,dp);
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return dfs(0,0,m,n,dp);
    }
}