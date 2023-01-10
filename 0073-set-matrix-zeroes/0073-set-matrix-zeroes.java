class Solution {
    public void setZeroes(int[][] matrix) {
        //space optimised approach
        int col0=-1; //for checking if column 0 needs to be 0, for row0 use matrix[0][0]
        
        //1st traversal
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    
                    //for 0 th column
                    if(j==0){
                        matrix[i][0]=0;
                        col0=0;
                    }
                    //for 0th row and every other row and column
                    else{
                        matrix[0][j]=0; //marking column
                        matrix[i][0]=0; //marking row
                    }
                    
                    
                }
            }
        }
        
        
        //second traversal should be in reverse cause if we do from front then 0th row and column would change which would change the whole matrix
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[i].length-1;j>=0;j--){
                //check if 0th column
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