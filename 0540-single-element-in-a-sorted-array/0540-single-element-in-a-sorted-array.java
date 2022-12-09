class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1;
        
        if(nums.length==1){
            return nums[0];
        }
        
        while(low<=high){
            int mid= (high-low)/2+low;
            if(mid>=nums.length-1){
                break;
            }
            //even mid index
            if(mid%2==0){
                //normal case (single element hasnt occured)
                if(nums[mid+1]==nums[mid]){
                    low=mid+1;
                }
                //single element has occured before
                else{
                    high=mid-1;
                }
            }
            
            //odd mid index
            else{
                if(nums[mid-1]==nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        
        return nums[low];
    }
}