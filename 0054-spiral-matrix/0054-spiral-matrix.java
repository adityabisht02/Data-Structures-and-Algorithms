class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int left=0,right=matrix[0].length-1,bottom=matrix.length-1,top=0;
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length*matrix[0].length;
        while(true){
            
            //left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
                
            }
            top++;
            if(top>bottom)break;
            
            //top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
                
            }
            right--;
            if(left>right)break;
            
            //right to left
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
                
            }
            bottom--;
            if(top>bottom)break;
            
            //bottom to top
            for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
               
            }
            left++;
            if(left>right)break;
        }
        
        return ans;
    }
}