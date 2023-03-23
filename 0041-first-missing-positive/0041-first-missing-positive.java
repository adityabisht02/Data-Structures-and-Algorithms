class Solution {
    public int firstMissingPositive(int[] nums) {
        // get rid of negative numbers and zero by replacing them with an already existing positive in array
        // traverse array and mark n-1 th index as negative to mark nth element
        // check if all present , if yes return nums.length+1 else return the missing num
    
    int positive=-1;
        
        //find positive
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive=nums[i];
                break;
            }
        }
        //if no positive element
        if(positive==-1){
            return 1;
        }
        
        //replace negatives and 0
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                nums[i]=positive;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            //mark at n-1 
            int markingIndex=Math.abs(nums[i])-1;
            
            //if element hasnt been marked and is in array index range
            if(nums[i]<=nums.length){
                 if(nums[markingIndex]>0){
                nums[markingIndex]=-nums[markingIndex];
            }
            }
           
            
        }
        
        //check indices to see which num is missing
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                //we marked i-1 for n so return i+1
                return i+1;
            }
        }
        
        return nums.length+1;
    }
}