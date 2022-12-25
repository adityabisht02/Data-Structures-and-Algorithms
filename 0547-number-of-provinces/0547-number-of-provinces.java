class Solution {
    
    public void bfs(int isConnected[][],boolean visited[],int node){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            int currentNode=q.poll();
            visited[currentNode]=true;
            //now we traverse the adjacency list to add all of currentnodes connected nodes to queue
            for(int i=0;i<isConnected[0].length;i++){
                if(!visited[i] && isConnected[currentNode][i]==1){
                    q.add(i);
                    visited[i]=true;
                }
            }
            
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int numberOfNodes=isConnected[0].length;
        
        boolean visited[]=new boolean[numberOfNodes];
        int numberOfProvinces=0;
        
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]){
                continue;
            }
            
            for(int j=0;j<isConnected[0].length;j++){
                if(!visited[j] && isConnected[i][j]==1){
                    bfs(isConnected,visited,j);
                    numberOfProvinces++;
                }
            }
        }
        return numberOfProvinces;
    }
}