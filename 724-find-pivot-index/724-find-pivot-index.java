class Solution {
    public int pivotIndex(int[] nums) {
        int prefix[]=new int[nums.length];
        
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        
        int leftSum=0,rightSum=0;
        
        //traverse prefix to find pivot
        for(int i=0;i<prefix.length;i++){
            if(i!=0){
                leftSum=prefix[i-1];
            }
            rightSum=prefix[prefix.length-1]-prefix[i];
            
            if(leftSum==rightSum){
                return i;
            }
            
        }
        
        return -1;
    }
}