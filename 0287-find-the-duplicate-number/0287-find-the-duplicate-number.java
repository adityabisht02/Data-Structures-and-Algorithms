class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int markingIndex=Math.abs(nums[i]);
            if(nums[markingIndex]<0){
                return markingIndex;
            }
            else{
                nums[markingIndex]=-nums[markingIndex];
            }
        }
        
        return -1;
    }
}