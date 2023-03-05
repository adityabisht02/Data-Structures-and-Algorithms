class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=(matrix.length*matrix[0].length)-1;
        int c=matrix[0].length;
        while(low<=high){
            int mid=(high-low)/2+low;
            int current=matrix[mid/c][mid%c];
            if(current==target){
                return true;
            }else if(target>current){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        
        return false;
    }
}