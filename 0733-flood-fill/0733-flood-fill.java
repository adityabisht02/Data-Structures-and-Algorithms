class Solution {
    class node{
        int r;
        int c;
        node(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    
    public void bfs(int image[][],int visited[][],int sr,int sc,int newcolor,int oldcolor){
        Queue<node> q=new LinkedList<>();
        q.add(new node(sr,sc));
        visited[sr][sc]=1;
        
        
        while(!q.isEmpty()){
            node current=q.poll();
            int r=current.r;
            int c=current.c;
            
            visited[r][c]=1;
image[r][c]=newcolor;
            
            if(r+1<image.length && visited[r+1][c]!=1 && image[r+1][c]==oldcolor){
                q.add(new node(r+1,c));
            }
            if(c+1<image[0].length && visited[r][c+1]!=1 && image[r][c+1]==oldcolor){
                q.add(new node(r,c+1));
            }
            if(r-1>=0 && visited[r-1][c]!=1 && image[r-1][c]==oldcolor){
                q.add(new node(r-1,c));
            }
            if(c-1>=0 && visited[r][c-1]!=1 && image[r][c-1]==oldcolor){
                q.add(new node(r,c-1));
            }
            
        }
        
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int visited[][]=new int[image.length][image[0].length];
        int oldcolor=image[sr][sc];
        if(oldcolor==color){
            return image;
        }
        
        bfs(image,visited,sr,sc,color,oldcolor);
        
        return image;
    }
}