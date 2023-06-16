//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int visited[],int src,int previousParent){
        if(visited[src]==1){
            return true;
        }
        
        visited[src]=1;
        ArrayList<Integer> children=adj.get(src);
        for(int i=0;i<children.size();i++){
            int child=children.get(i);
            if(child==previousParent){
                continue;
            }
            boolean res=dfs(adj,visited,child,src);
            if(res){
                return true;
            }
        }
        return false;
        
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        int visited[]=new int[V];
        //check all connected components
        for(int i=0;i<V;i++){
            if(visited[i]!=1){
                boolean res=dfs(adj,visited,i,-1);
                 if(res){
                return true;
            }
            }
           
        }
        
        return false;
        
    }
}