class Solution {
    public boolean canJump(int[] nums) {
        //go backwards from goal state and keep changing goal state 
        int goalIndex=nums.length-1;
        
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=goalIndex){
                goalIndex=i;
            }
        }
        
        return (goalIndex==0);
    }
}