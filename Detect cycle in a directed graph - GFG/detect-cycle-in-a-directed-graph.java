//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    public boolean hasCycle(ArrayList<ArrayList<Integer>> adj,int visited[],int pathVisited[],int node){
        if(visited[node]==1){
            if(pathVisited[node]==1){
                return true;
            }
            return false;
        }
        visited[node]=1;
        pathVisited[node]=1;
        ArrayList<Integer> children=adj.get(node);
        for(int i=0;i<children.size();i++){
            int child=children.get(i);
            if(hasCycle(adj,visited,pathVisited,child)){
                return true;
            }
        }
        pathVisited[node]=0;
        return false;
    }
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int visited[]=new int[V];
        int pathVisited[]=new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]!=1){
                if(hasCycle(adj,visited,pathVisited,i)){
                    return true;
                }
            }
        }
        return false;
    }
}