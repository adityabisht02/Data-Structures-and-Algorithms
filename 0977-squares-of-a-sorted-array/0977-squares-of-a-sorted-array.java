class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int low=0,high=nums.length-1;
        int index=ans.length-1; //index for new array where we'll insert from reverse
        
        while(low<=high){
        if(Math.abs(nums[low])>Math.abs(nums[high])){
        ans[index]=nums[low]*nums[low];
            low++;
        }
            else{
                ans[index]=nums[high]*nums[high];
                high--;
            }
            
            index--;
        }
        
        return ans;
        
    }
}