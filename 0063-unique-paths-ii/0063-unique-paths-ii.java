class Solution {
    public int findAllPaths(int obstacleGrid[][],int r,int c,int dp[][]){
        //if at goal element
        if(r==obstacleGrid.length-1 && c==obstacleGrid[0].length-1){
            return 1;
        }
        if(r>=obstacleGrid.length || c>=obstacleGrid[0].length || obstacleGrid[r][c]==1){
            return 0;
        }
        if(dp[r][c]!=0){
            return dp[r][c];
        }
        return dp[r][c]=findAllPaths(obstacleGrid,r+1,c,dp) +findAllPaths(obstacleGrid,r,c+1,dp);
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        int dp[][]=new int[m][n];
        int paths=findAllPaths(obstacleGrid,0,0,dp);
        return paths;
    }
}