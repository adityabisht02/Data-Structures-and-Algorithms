//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    public boolean dfs(int grid[][],int r,int c,int vis[][]){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0 || vis[r][c]==1){
            return false;
        }
        if(grid[r][c]==2){
            return true;
        }
        vis[r][c]=1;
        
        boolean b1=dfs(grid,r+1,c,vis);
        boolean b2=dfs(grid,r-1,c,vis);
        boolean b3=dfs(grid,r,c+1,vis);
        boolean b4=dfs(grid,r,c-1,vis);
        
        return (b1 || b2 || b3 || b4);
        
    }
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        int r=-1,c=-1;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    r=i;
                    c=j;
                    break;
                }
            }
        }
        if(r==-1 || c==-1){
            return false;
        }
        int vis[][]=new int[grid.length][grid[0].length];
        return dfs(grid,r,c,vis);
    }
}