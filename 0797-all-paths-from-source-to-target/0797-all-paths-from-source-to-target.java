class Solution {
    public void dfs(List<List<Integer>> paths,List<Integer> path,int graph[][],int current){
        //add current node to path
        path.add(current);
        
        //if last node
        if(current==graph.length-1){
            paths.add(path);
            return;
        }
        
        //run a loop to perform dfs and add to path list
        for(int i=0;i<graph[current].length;i++){
         dfs(paths,new ArrayList(path),graph,graph[current][i]);
        }        
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths=new ArrayList<>();
        
        dfs(paths,new ArrayList<>(),graph,0);
        return paths;
    }
}