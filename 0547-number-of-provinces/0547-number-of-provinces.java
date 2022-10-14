class Solution {
    
    public void bfs(int isConnected[][],int visited[],int node){
 
        Queue<Integer> q=new LinkedList<>();
        q.offer(node);
        
        while(!q.isEmpty()){
            int current=q.poll();
            visited[current]=1;
            
           for(int i=0;i<isConnected[0].length;i++){
               if(isConnected[current][i]!=0 && visited[i]!=1){
                   q.offer(i);
                   visited[i]=1;
               }
           }
        }
        
        
    }
    
    public int findCircleNum(int[][] isConnected) {
        
        int i,j,provincecount=0;
        int visited[]=new int[isConnected.length];
        
        for(i=0;i<isConnected.length;i++){
            
            if(visited[i]==1){
                continue;
            }
            for(j=0;j<isConnected[0].length;j++){
                
                //if not visited and is connected
                if(visited[j]==0 && isConnected[i][j]==1){
                    //everytime u do a bfs u complete one connected component
                     bfs(isConnected,visited,j);
                    provincecount++;
                }
               
            }
        }
        
        return provincecount;
    }
}