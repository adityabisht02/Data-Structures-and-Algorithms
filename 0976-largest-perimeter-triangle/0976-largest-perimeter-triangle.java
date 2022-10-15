class Solution {
    public int largestPerimeter(int[] nums) {
        int n1=0,n2=0,n3=0;
        
        Arrays.sort(nums);
        
        for(int i=2;i<nums.length;i++){
            if(nums[i-2]+nums[i-1]>nums[i]){
                n1=nums[i-1];
                n2=nums[i-2];
                n3=nums[i];
            }
        }
        
        return n1+n2+n3;
    }
}