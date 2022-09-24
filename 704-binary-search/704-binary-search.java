class Solution {
    public int search(int[] nums, int target) {
        int low=0,high=nums.length-1,mid;
        
        while(low<=high){
            mid=(high-low)/2+low;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return -1;
    }
}