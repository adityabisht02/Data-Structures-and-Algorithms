class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int ans[][]=new int[m][n];
        int index=0;
        
        for(int c=0;c<n;c++){
            for(int r=m-1;r>=0;r--){
                ans[index/m][index%m]=matrix[r][c];
                index++;
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}