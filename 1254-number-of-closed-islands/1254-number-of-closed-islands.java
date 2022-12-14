class Solution {
    public boolean dfs(int grid[][],int visited[][],int r,int c){
        
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length){
            return false;
        }
        if(grid[r][c]==1 || visited[r][c]==1){
            return true;
        }
        visited[r][c]=1;
        
        boolean v1=dfs(grid,visited,r+1,c);
         boolean v2=dfs(grid,visited,r-1,c);
         boolean v3=dfs(grid,visited,r,c+1);
         boolean v4=dfs(grid,visited,r,c-1);
        
        return (v1 && v2 && v3&& v4);
        
    }
    public int closedIsland(int[][] grid) {
        int visited[][]=new int[grid.length][grid[0].length];
        int numberOfClosedIslands=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0 && visited[i][j]!=1){
                    boolean isClosed= dfs(grid,visited,i,j);
                    if(isClosed){
                        numberOfClosedIslands++;
                    }
                }
            }
        }
        return numberOfClosedIslands;
    }
}