class Solution {
    public void dfs(int image[][],int sr,int sc, int newcolor,int oldcolor){
        if(sr<0 || sc<0 || sr>=image.length ||sc>=image[0].length || image[sr][sc]!=oldcolor){
            return ;
        }
        image[sr][sc]=newcolor;
        
        dfs(image,sr+1,sc,newcolor,oldcolor);
        dfs(image,sr-1,sc,newcolor,oldcolor);
        dfs(image,sr,sc+1,newcolor,oldcolor);
        dfs(image,sr,sc-1,newcolor,oldcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int oldcolor=image[sr][sc];
        if(oldcolor==color){
            return image;
        }
        dfs(image,sr,sc,color,oldcolor);
        
        return image;
    }
}