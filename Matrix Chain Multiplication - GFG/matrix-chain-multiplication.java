//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int helper(int arr[],int i,int j,int dp[][]){
        if(j<=i){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int steps=helper(arr,i,k,dp)+helper(arr,k+1,j,dp)+(arr[i-1]*arr[j]*arr[k]);
            min=Math.min(steps,min);
        }
        return dp[i][j]=min;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        int dp[][]=new int[N][N];
        
        return helper(arr,1,arr.length-1,dp);
    }
}