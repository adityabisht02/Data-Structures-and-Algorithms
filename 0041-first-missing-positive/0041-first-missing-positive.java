class Solution {
    public int firstMissingPositive(int[] nums) {
        int num=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                num=nums[i];
                break;
            }
        }
        //if no positive integers in array return 1
        if(num==-1){
            return 1;
        }
        //else replace all negative integers and 0 with num to take care of negatives
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                nums[i]=num;
            }
        }
        
        //traverse the array and mark positive elements at their (index-1)
        for(int i=0;i<nums.length;i++){
            int absval=Math.abs(nums[i]);
            if(absval>nums.length){
                continue;
            }
            else if(nums[absval-1]>0){
                nums[absval-1]=-nums[absval-1];
            }
        }
        
        //now traverse the array and find first missing positive
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        
        //if all elements covered then return the next element as ans
        return nums.length+1;
    }
}