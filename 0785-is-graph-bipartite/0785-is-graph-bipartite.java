class Solution {
    public int colorNode(int adjcolor){
        if(adjcolor==0){
            return 1;
        }
        return 0;
    }
    
    public boolean check(int graph[][],int node,int visited[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            int parent=q.poll();
            int adjcolor=visited[parent];
            
            for(int i=0;i<graph[parent].length;i++){
                int element=graph[parent][i];
                //if node not visited then color it
                if(visited[element]==-1){
                    q.add(element);
                    int color=colorNode(adjcolor);
                    visited[element]=color;
                }
                //if both have same color return false
                else if(visited[element]==adjcolor){
                    return false;
                }
            }
        }
    return true;
    }
    public boolean isBipartite(int[][] graph) {
        int visited[]=new int[graph.length];
        //mark all elements in visited -1
        for(int i=0;i<visited.length;i++){
            visited[i]=-1;
        }
       
        
        for(int i=0;i<graph.length;i++){
            //if not colored color this node
            if(visited[i]==-1){
                visited[i]=0;
            }
            boolean result =check(graph,i,visited); 
            if(result==false){
                return false;
            }
        }
        
        return true;
    }
}