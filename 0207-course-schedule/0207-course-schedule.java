class Solution {
    
    public boolean cycleExists(List<List<Integer>> adj,int node,int pathVisited[],int visited[]){
        visited[node]=1;
        pathVisited[node]=1;
        
        List<Integer> children=adj.get(node);
        for(int i=0;i<children.size();i++){
            int child=children.get(i);
            if(visited[child]==1){
                if(pathVisited[child]==1){
                    return true;
                }
            }
            else{
                boolean res=cycleExists(adj,child,pathVisited,visited);
                if(res){
                    return true;
                }
            }
        }
        //remove node from pathvisited since we are returning tp previous recursion stack
        pathVisited[node]=0;
        return false;
    }    
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            int arr[]=prerequisites[i];
            int el1=arr[0];
            int el2=arr[1];
            //add edge
            adj.get(el2).add(el1);
        }
        int visited[]=new int[numCourses];
        int pathVisited[]=new int[numCourses];
        
        //can be multiple components so
        for(int i=0;i<numCourses;i++){
            if(visited[i]!=1){
                if(cycleExists(adj,i,pathVisited,visited)){
                    //if cycle exists we cannot complete courses
                    return false;
                }
            }
        }
        return true;
        
        
    }
}