class Solution {
    public void dfs(List<List<Integer>> rooms,int src,int visited[]){
        if(visited[src]==1){
            return ;
        }
        visited[src]=1;
        List<Integer> children=rooms.get(src);
        for(int i=0;i<children.size();i++){
            int child=children.get(i);
            dfs(rooms,child,visited);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int visited[]=new int[rooms.size()];
        dfs(rooms,0,visited);
        
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0){
                return false;
            }
        }
        return true;
    }
}