//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    static class Node implements Comparable<Node>{
        int node;
        int dist;
        Node(int n,int d){
            node=n;
            dist=d;
        }
        public int compareTo(Node temp){
            return (this.dist-temp.dist);
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int distances[]=new int[V];
        int visited[]=new int[V];
        
        Arrays.fill(distances,Integer.MAX_VALUE);
        
        PriorityQueue<Node> pq=new PriorityQueue<>();
        pq.add(new Node(S,0));
        distances[S]=0;
        
        while(!pq.isEmpty()){
            Node current=pq.poll();
            int node=current.node;
            int distanceFromSource=current.dist;
            if(visited[node]==1){
                continue;
            }
            visited[node]=1;
            ArrayList<ArrayList<Integer>> children=adj.get(node);
            for(int i=0;i<children.size();i++){
                int childNode=children.get(i).get(0);
                int weight=children.get(i).get(1);
                if(distanceFromSource+weight<distances[childNode]){
                    distances[childNode]=distanceFromSource+weight;
                    pq.add(new Node(childNode,distances[childNode]));
                }
                
            }
        }
        
        
        
        
        return distances;
    }
}

