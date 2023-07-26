//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    long maxSum=-1;
    public void hasCycle(int edge[],int visited[],int pathVisited[],int node){
        if(visited[node]==1){
            if(pathVisited[node]==1){
                int i=node;
                long sum=0;
                while(edge[i]!=node){
                    sum+=i;
                    i=edge[i];
                }
                sum+=i;
                maxSum=Math.max(maxSum,sum);
            }
        }
        else{
           visited[node]=1;
        pathVisited[node]=1;
        
        if(edge[node]!=-1){
            hasCycle(edge,visited,pathVisited,edge[node]);
        } 
        }
        
        pathVisited[node]=0;
       
    }
    public long largesSumCycle(int N, int Edge[]){
        int visited[]=new int[N];
        int pathVisited[]=new int[N];
        
        for(int i=0;i<N;i++){
            if(visited[i]!=1){
                hasCycle(Edge,visited,pathVisited,i);
            }
        }
        
        return maxSum;
    }
}