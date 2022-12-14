class Solution {
    int enclaves=0,cells;
    
    public boolean dfs(int grid[][],int visited[][],int r,int c){
        
         //if its crossing boundary means u can walk off hence return false
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length){
            return false;
        }
        
        if(grid[r][c]==0 || visited[r][c]==1){
            return true;
        }
       
        //mark the node as visited and count the cell
        visited[r][c]=1;
        cells++;
        
        boolean b1=dfs(grid,visited,r+1,c);
        boolean b2=dfs(grid,visited,r-1,c);
        boolean b3=dfs(grid,visited,r,c+1);
        boolean b4=dfs(grid,visited,r,c-1);
        
        return (b1 && b2 && b3 && b4);
    }
    
    public int numEnclaves(int[][] grid) {
        int visited[][]=new int[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]!=1 && grid[i][j]==1){
                    cells=0;
                    boolean isEnclave=dfs(grid,visited,i,j);
                    if(isEnclave){
                        enclaves+=cells;
                    }
                    
                }
            }
        }
        return enclaves;
    }
}