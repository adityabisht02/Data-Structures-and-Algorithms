class Solution {
    public int largestPerimeter(int[] nums) {
        int n1=0,n2=0,n3=0;
        
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>=2;i--){
           if(nums[i]<nums[i-1]+nums[i-2]){
               return nums[i]+nums[i-1]+nums[i-2];
           }
        }
        
        return 0;
    }
}