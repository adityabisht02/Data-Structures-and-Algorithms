class Solution {
   int areacount,maxarea=0;
    
   public void dfs(int grid[][],int visited[][],int r,int c){
     if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || visited[r][c]==1 || grid[r][c]==0){
         return  ;
     }
       
       areacount++;
       System.out.print(areacount+ " ");
       visited[r][c]=1;
       
       
       dfs(grid,visited,r-1,c);
        dfs(grid,visited,r+1,c);
        dfs(grid,visited,r,c+1);
        dfs(grid,visited,r,c-1);
       
   }    

   public int maxAreaOfIsland(int[][] grid) {
     
       int i,j;
       
       //visited array to keep track of visited elements
       int visited[][]=new int[grid.length][grid[0].length];
       
       
       for(i=0;i<grid.length;i++){
           for(j=0;j<grid[0].length;j++){
               
               //if element is 1 and not visited
               if(grid[i][j]==1 && visited[i][j]==0){
                   
                   areacount=0;
                   dfs(grid,visited,i,j);
                   System.out.println();
                   if(areacount>maxarea){
                       maxarea=areacount;
                   }
               }
           }
       }
       
       return maxarea;
       
    }
}