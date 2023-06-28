class Solution {
    public boolean search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
             if(nums[mid]==target){
                return true;   
            }  
            //check special condition
            else if(nums[mid]==nums[low] && nums[mid]==nums[high]){
                //means we can shrink the array
                low++;
                high--;
            }
                
            //if left part sorted
            else if(nums[low]<=nums[mid]){
                //if target contained
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;
                }
                //if target not in left part
                else{
                    low=mid+1;
                }
            }
            //if right part sorted
            else{
                if(target<=nums[high] && target>=nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        
        return false;
        
    }
}