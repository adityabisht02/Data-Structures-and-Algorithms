class Solution {
    public boolean canJump(int[] nums) {
        int minJumpCount=1;
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<minJumpCount){
                minJumpCount++;
            }
            else if(nums[i]>=minJumpCount){
                minJumpCount=1;
            }
        }
        if(minJumpCount>1){
            return false;
        }
        return true;
    }
}