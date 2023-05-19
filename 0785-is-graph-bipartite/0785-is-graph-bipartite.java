class Solution {
    public int getColor(int color){
        if(color==1){
            return 2;
        }
        return 1;
    }
    public boolean bfs(int graph[][],int node,int visited[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        if(visited[node]==0){
            visited[node]=1;
        }
        
        while(!q.isEmpty()){
            int current=q.poll();
            int currentcolor=visited[current];
            //add children
            for(int i=0;i<graph[current].length;i++){
                int adjacent=graph[current][i];
                if(visited[adjacent]==0){
                    int color=getColor(currentcolor);
                    q.add(adjacent);
                    visited[adjacent]=color;
                }
                //else if not 0 then chevk color
                else{
                    if(visited[adjacent]==currentcolor){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        
        int visited[]=new int[graph.length];
        //color the 0th node
   
        for(int i=0;i<graph.length;i++){
            boolean res=bfs(graph,i,visited);
            if(!res){
                return false;
            }
        }
        
        return true;
        
    }
}