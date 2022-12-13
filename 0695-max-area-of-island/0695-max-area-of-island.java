class Solution {
    int maxArea=0,area;
    public void dfs(int grid[][],int visited[][],int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0 || visited[r][c]==1){
            return ;
        }
        area++;
        visited[r][c]=1;
        dfs(grid,visited,r+1,c);
         dfs(grid,visited,r-1,c);
         dfs(grid,visited,r,c+1);
         dfs(grid,visited,r,c-1);
        
        
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        
        int visited[][]=new int [grid.length][grid[0].length];
        
        
        for(int i=0;i<grid.length;i++){
           
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]!=1 && grid[i][j]==1){
                     area=0;
                    dfs(grid,visited,i,j);
                    if(area>maxArea){
                        maxArea=area;
                    }
                }
            }
        }
        
        return maxArea;
        
    }
}