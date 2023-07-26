class Solution {
    public boolean dfs(List<List<Integer>> adj,int visited[],int node,int pathVisited[]){
        if(visited[node]==1){
            if(pathVisited[node]==1){
                return true;
            }
            return false;
        }
        visited[node]=1;
        pathVisited[node]=1;
        
        List<Integer> children=adj.get(node);
        for(int i=0;i<children.size();i++){
           int child=children.get(i);
            if(dfs(adj,visited,child,pathVisited)){
                return true;
            }
        }
        pathVisited[node]=0;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int temp[]=prerequisites[i];
            int el1=temp[0];
            int el2=temp[1];
            adj.get(el2).add(el1);
        }
        int visited[]=new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
        if(visited[i]!=1){
            if(dfs(adj,visited,i,new int[numCourses])){
                return false;
            }
        }    
        }
        return true;
    }
}