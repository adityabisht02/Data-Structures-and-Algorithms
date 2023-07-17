class Solution {
    public void dfs(int graph[][],List<List<Integer>> ans,int visited[],int src,List<Integer> path){
        if(src==graph.length-1){
            path.add(src);
            ans.add(new ArrayList<>(path));
            return ;
        }
        path.add(src);
        int children[]=graph[src];
        for(int i=0;i<children.length;i++){
            dfs(graph,ans,visited,children[i],new ArrayList<>(path));
        }
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        int visited[]=new int[graph.length];;
        dfs(graph,ans,visited,0,new ArrayList<>());
        
        return ans;
    }
}