class Solution {
    public void setZeroes(int[][] matrix) {
      int col0=-1;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    // if 0th column
                    if(j==0){
                        col0=0;
                        matrix[i][0]=0;
                    }
                    else{
                        matrix[0][j]=0;
                        matrix[i][0]=0;
                    }
                }
            }
        }
        
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(j==0){
                    if(col0==0){
                        matrix[i][j]=0;
                    }
                }  
                else if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}