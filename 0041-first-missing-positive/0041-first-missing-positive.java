class Solution {
    public int firstMissingPositive(int[] nums) {
        // 3,4,-1,1
        //     1,2,3,4,5,6
        //     0,-1,-2,-3,-4,-5 6    lastindexel=
        
        int arr[]=new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && nums[i]<nums.length+1){
                arr[nums[i]]=1;
            }
        }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=1){
                return i;
            }
        }
        
        return nums.length+1;
    }
}