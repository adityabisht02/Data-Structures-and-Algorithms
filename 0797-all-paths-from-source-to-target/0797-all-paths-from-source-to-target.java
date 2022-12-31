class Solution {
    public void dfs(int graph[][],List<List<Integer>> paths,List<Integer> path,int node){
        path.add(node);
        
        if(node==graph.length-1){
            paths.add(path);
            return ;
        }
        for(int i=0;i<graph[node].length;i++){
            dfs(graph,paths,new ArrayList(path),graph[node][i]);
        }
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths= new ArrayList<>();
        dfs(graph,paths,new ArrayList<>(),0);
            return paths;
    }
}