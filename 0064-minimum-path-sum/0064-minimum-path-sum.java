class Solution {
    public int helper(int grid[][],int r,int c,int dp[][]){
        if(r==grid.length-1 && c==grid[0].length-1){
            return grid[r][c];
        }
        if(dp[r][c]!=0){
            return dp[r][c];
        }
        if(r==grid.length-1 && c!=grid[0].length-1){
            return dp[r][c]=grid[r][c]+helper(grid,r,c+1,dp);
        }
         if(r!=grid.length-1 && c==grid[0].length-1){
            return dp[r][c]=grid[r][c]+helper(grid,r+1,c,dp);
        }
        return dp[r][c]=grid[r][c]+Math.min(helper(grid,r+1,c,dp),helper(grid,r,c+1,dp));
    }
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        return helper(grid,0,0,dp);
    }
}