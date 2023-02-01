class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            //if mid is target
            if(nums[mid]==target){
                return mid;
            }
            
            //if left half sorted
            if(nums[low]<=nums[mid]){
                //if target is contained in this half
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1; //since mid is already checked
                }
                //else target is in other part
                else{
                    low=mid+1;
                }
            }
            
            //if right part sorted
            else{
                //if target contained in right part
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                //target not contained
                else{
                    high=mid-1;
                }
            }
        }
        
        return -1;
    }
}