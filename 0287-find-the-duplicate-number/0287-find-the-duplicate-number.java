class Solution {
    public int findDuplicate(int[] nums) {
        //use nums as a hash table, put nums[i]=-nums[i] if i doesnt already exist
        
        for(int i : nums){
            int index=Math.abs(i);
            //if i has already occured before nums[index] will be negative
            if(nums[index]<0){
                return index;
            }
            nums[index]=-nums[index];
        }
            
            
        return -1;
    }
}