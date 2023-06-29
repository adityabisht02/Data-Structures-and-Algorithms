//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        
       //find first and last occurence
        int low=0,high=n-1;
        int firstOcc=-1;
        while(low<=high){
            int mid=(high-low)/2+low;
            if(arr[mid]==x){
                firstOcc=mid;
                high=mid-1;
            }
            else if(x<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        int lastOcc=-1;
        low=0;
        high=n-1;
        
        while(low<=high){
            int mid=(high-low)/2+low;
            if(arr[mid]==x){
                lastOcc=mid;
                low=mid+1;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(firstOcc==-1){
            if(lastOcc==-1){
                return 0;
            }
            else{
                return 1;
            }
        }
        if(lastOcc==-1){
            if(firstOcc==-1){
                return 0;
            }
            else{
                return 1;
            }
        }
        
        return (lastOcc-firstOcc+1);
    }
}