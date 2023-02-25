//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String ans="";
        int length=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()<length){
                length=arr[i].length();
            }
        }
        
        
        
        for(int i=0;i<length;i++){
            char temp=arr[0].charAt(i);
            for(int j=0;j<arr.length;j++){
                if(arr[j].charAt(i)!=temp){
                    if(ans==""){
                        return "-1";
                    }
                    return ans;
                }
            }
            ans+=temp;
        }
        
        return ans;
    }
}