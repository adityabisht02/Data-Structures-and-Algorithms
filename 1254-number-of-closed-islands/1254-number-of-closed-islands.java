class Solution {
    public boolean dfs(int grid[][],int visited[][],int r,int c){
        //if its crossing the boundary it means island is not closed
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length){
            return false;
        }
        //if water element or already visited element
        if(grid[r][c]==1 || visited[r][c]==1){
            return true;
        }
        visited[r][c]=1;
        
       boolean b1= dfs(grid,visited,r+1,c);
        
       boolean b2= dfs(grid,visited,r-1,c) ;
          boolean b3=  dfs(grid,visited,r,c+1) ;
          boolean b4=  dfs(grid,visited,r,c-1);
        return (b1 && b2 && b3 && b4);
    }
    
    public int closedIsland(int[][] grid) {        
        int visited[][]=new int[grid.length][grid[0].length];
        int closedIslands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //if is land and is not visited do dfs
                if(visited[i][j]==0 && grid[i][j]==0){
                    boolean isClosed= dfs(grid,visited,i,j);
                    if(isClosed){
                        closedIslands++;
                    }
                }
                
            }
        }
        
        return closedIslands;
    }
}