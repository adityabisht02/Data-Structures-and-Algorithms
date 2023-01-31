class Solution {
    public void rotate(int[][] matrix) {
       //DO TRANSPOSE AND THEN ROWISE SWITCHING
        //IN PLACE TRANSPOSE CAUSE ROWS AND COLUMNS ARE EQUAL
        
        
        //transpose loop
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){  //j equal to i to prevent repeated swapping of already swapped nodes
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        
        //reversing rowwise
        for(int i=0;i<matrix.length;i++){
            //inside every row we reverse rows using two pointers
            int low=0,high=matrix[i].length-1;
            
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
                
            }
        }
        
    }
}