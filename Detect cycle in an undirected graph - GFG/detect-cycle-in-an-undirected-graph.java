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
    class Pair{
        int node;
        int previousParent;
        Pair(int node,int pp){
            this.node=node;
            previousParent=pp;
        }
    }
  
    
    public boolean bfs(ArrayList<ArrayList<Integer>> adj,int visited[],int src){
        Queue<Pair> q=new LinkedList<>();
        //keep pp as -1 at start
        q.add(new Pair(src,-1)); 
        visited[src]=1;
        while(!q.isEmpty()){
            Pair currentNode=q.poll();
            int current=currentNode.node;
            int previousParent=currentNode.previousParent;
            ArrayList<Integer> children=adj.get(current);
            for(int i=0;i<children.size();i++){
                int child=children.get(i);
                //if child not visited add it to queue
                if(visited[child]!=1){
                    q.add(new Pair(child,current));
                    visited[child]=1;
                }
                //if visited and not parent
                else{
                    if(child!=previousParent){
                        return true;
                    }
                }
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
                boolean res=bfs(adj,visited,i);
                 if(res){
                return true;
            }
            }
           
        }
        
        return false;
        
    }
}