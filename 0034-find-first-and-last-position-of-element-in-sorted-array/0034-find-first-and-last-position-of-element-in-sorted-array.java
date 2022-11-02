class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurence=-1,lastOccurence=-1;
        
        int low=0,high=nums.length-1,mid;
        
        //find first occurence first
        while(low<=high){
            mid=(high-low)/2+low;
            if(nums[mid]==target){
                firstOccurence=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        
        //reset low and high
        low=0;
        high=nums.length-1;
        
        //find last occurence first
        while(low<=high){
            mid=(high-low)/2+low;
            if(nums[mid]==target){
                lastOccurence=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        
        int ans[]=new int[2];
        
        ans[0]=firstOccurence;
        ans[1]=lastOccurence;
        
        return ans;
    }
}