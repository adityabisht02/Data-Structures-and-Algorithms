class Solution {
    //keeping the function to check whether closed island
    public boolean dfs(int grid[][],int visited[][],int r,int c,int grid2[][]){
        if(r<0 ||c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0 || visited[r][c]==1){
            return true;
        }
        boolean isSubIsland=true;
        visited[r][c]=1;
        //if not equal do not return it yet, we have to visit and mark the whole island first
        if(grid[r][c]!=grid2[r][c]){
            isSubIsland=false;
        }
        
        boolean b1=dfs(grid,visited,r+1,c,grid2);
        boolean b2=dfs(grid,visited,r-1,c,grid2);
        boolean b3=dfs(grid,visited,r,c+1,grid2);
        boolean b4=dfs(grid,visited,r,c-1,grid2);       
        
        //now return whether all nodes are present i grid2
        return (isSubIsland && b1 &&b2 && b4 && b3);
        
    }
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int visited[][]=new int[grid2.length][grid2[0].length];
        int numberOfSubIslands=0;
        
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[i].length;j++){
                if(visited[i][j]!=1 && grid2[i][j]==1){
                    boolean isSubIsland=dfs(grid2,visited,i,j,grid1);
                    if(isSubIsland){
                        numberOfSubIslands++;
                    }
                }
            }
        }
        return numberOfSubIslands;
    }
}