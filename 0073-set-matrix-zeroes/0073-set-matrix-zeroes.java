class Solution {
    public void setZeroes(int[][] matrix) {
        int rows[]=new int[matrix.length];
        int columns[]=new int[matrix[0].length];
        
        //traverse the matrix and mark rows and columns where 0 has occured 
        //we will mark using a -1
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows[i]=-1;
                    columns[j]=-1;
                }
            }
        }
        
        //now traverse matrix and for marked row and column put 0 in 1 iteration
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rows[i]==-1 || columns[j]==-1)     //means that row/column has to be marked 0
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}