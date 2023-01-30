class Solution {
    public void rotate(int[][] matrix) {
        int index=0;
        int ans[][]=new int[matrix.length][matrix[0].length];
        
        for(int c=0;c<matrix[0].length;c++){
            for(int r=matrix.length-1;r>=0;r--){
                ans[index/matrix.length][index%matrix[0].length]=matrix[r][c];
                index++;
            }
        }
            
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
        
     
    }
}