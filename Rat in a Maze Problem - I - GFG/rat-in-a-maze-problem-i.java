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


class Solution {
    public static void helper(int arr[][],ArrayList<String> ans,String temp,int r,int c,int visited[][]){
        if(r>=arr.length || c>=arr[0].length || c<0 || r<0 || visited[r][c]==1 || arr[r][c]==0){
            return ;
        }
        if(r==arr.length-1 && c==arr[0].length-1){
            ans.add(temp);
            return ;
        }
        visited[r][c]=1;
        helper(arr,ans,temp+"D",r+1,c,visited);
         helper(arr,ans,temp+"U",r-1,c,visited);
          helper(arr,ans,temp+"R",r,c+1,visited);
           helper(arr,ans,temp+"L",r,c-1,visited);
           visited[r][c]=0;
        
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans=new ArrayList<>();
        int visited[][]=new int[n][n];
        helper(m,ans,"",0,0,visited);
        return ans;
    }
}