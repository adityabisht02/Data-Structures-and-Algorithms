//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void helper(ArrayList<String> ans,int grid[][],int n,int r,int c,int visited[][],StringBuilder sb){
        if(r>=n || c>=n || r<0 || c<0){
            return ;
        }
        if(grid[r][c]==0 || visited[r][c]==1){
            return ;
        }
        if(r==n-1 && c==n-1){
            StringBuilder temp=new StringBuilder(sb);
            ans.add(temp.toString());
            return;
        }
       
        
        visited[r][c]=1;
        
        
        sb.append('U');
        helper(ans,grid,n,r-1,c,visited,sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append('D');
        helper(ans,grid,n,r+1,c,visited,sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append('R');
        helper(ans,grid,n,r,c+1,visited,sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append('L');
        helper(ans,grid,n,r,c-1,visited,sb);
        sb.deleteCharAt(sb.length() - 1);
        
        visited[r][c]=0;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
        if(m[0][0]==0){
            return ans;
        }
        helper(ans,m,n,0,0,new int[n][n],new StringBuilder());
        return ans;
    }  
}