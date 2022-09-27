class Solution {
    int count=0;
    
    public void dfs(int r,int c,char grid[][],int visited[][]){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0'|| visited[r][c]==1){
            return ;
        }
        visited[r][c]=1;
        dfs(r+1,c,grid,visited);
        dfs(r-1,c,grid,visited);
        dfs(r,c+1,grid,visited);
        dfs(r,c-1,grid,visited);
        
    }
    
    public int numIslands(char[][] grid) {
        
        int visited[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            
            for(int j=0;j<grid[i].length;j++){
                //if not visited and cell is land
                if(visited[i][j]==0 && grid[i][j]=='1'){
                    dfs(i,j,grid,visited);
                    count++;
                }                
            }
        }
        
        return count;
        
    }
}