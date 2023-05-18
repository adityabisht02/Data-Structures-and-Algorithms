class Solution {
    public int firstMissingPositive(int[] nums) {
        //get rid of negative numbers and zeroes
        //first find any positive number present in nums and replace all zeroes and negatives with that positive
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                num=nums[i];
                break;
            }
        }
        //no positives found, return 1
        if(num==0){
            return 1;
        }
        
        //if positive found replace all zeroes and negatives with the positive
        for(int i=0;i<nums.length;i++){
         if(nums[i]<=0){
             nums[i]=num;
         }   
        }     
        
        //mark all positivr integers using indexes
        for(int i=0;i<nums.length;i++){
            int markingIndex=Math.abs(nums[i]);
            //since we are marking on i-1
            markingIndex--;  
            //to mark eleemnt index that index should be in range of array and shouldnt be 0
            //also element shouldnt be already marked
            if(markingIndex>=0 && markingIndex<nums.length && nums[markingIndex]>0){
                 nums[markingIndex]=-nums[markingIndex];
            }
           
        }
        
        //now find which index has not been marked
        for(int i=0;i<nums.length;i++){
            //if index nit marked return that index
            if(nums[i]>0){
                return i+1;
            }
        }
        
        //if all marked
        return nums.length+1;
    }
}