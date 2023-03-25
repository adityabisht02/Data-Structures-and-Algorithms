class Solution {
    public long bfs(List<List<Integer>> graph,int visited[],int node){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        visited[node]=1;
        long count=0;
        
        while(!q.isEmpty()){
            int parent=q.poll();
            count++;
            for(int i=0;i<graph.get(parent).size();i++){
                int child=graph.get(parent).get(i);
                if(visited[child]!=1){
                    visited[child]=1;
                    q.add(child);
                }
            }
        }
        return count;
    }
    public long countPairs(int n, int[][] edges) {
        //find connected components and number of nodes i every connected component
        // multi nodes in 1 component to remaining nodes
        // subtract that component's nodes from total and do this for every component
        //basic math logic
        
        
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges.length;i++){
            int el1=edges[i][0];
            int el2=edges[i][1];
            graph.get(el1).add(el2);
            graph.get(el2).add(el1);
        }
        
        int visited[]=new int[n];
        List<Long> connectedcomponentcount=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(visited[i]!=1){
                  long count= bfs(graph,visited,i);
                connectedcomponentcount.add(count);                
            }
         
        }
        long pairs=0;
        
        for(int i=0;i<connectedcomponentcount.size();i++){
            long temp=connectedcomponentcount.get(i);
            long leftnodes=n-temp;
            pairs+=temp*leftnodes;
            n-=temp;
        }
        
        return pairs;
    }
}