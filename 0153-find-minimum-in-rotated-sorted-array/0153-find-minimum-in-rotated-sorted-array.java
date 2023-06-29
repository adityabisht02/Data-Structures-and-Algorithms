class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        
        int low=0,high=nums.length-1;
        
        while(low<=high){
            int mid=(high-low)/2+low;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                if(nums[mid]<min){
                    min=nums[mid];
                }
                low++;
                high--;
            }
            
            //check which half is sorted
            else if(nums[low]<=nums[mid]){
                //if left half sorted low would give the min from left half
                if(nums[low]<min){
                    min=nums[low];
                }
                //we can eliminate left half
                low=mid+1;
            }
            else{
                //right half sorted
                if(nums[mid]<min){
                    min=nums[mid];
                }
                high=mid-1;
            }
        }
        
        return min;
    }
}