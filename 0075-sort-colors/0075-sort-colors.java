class Solution {
    public void sortColors(int[] nums) {
        int i,j;
        
        for(i=0;i<nums.length;i++){
            j=i;
            
            while(j>0 && nums[j-1]>nums[j]){
                int temp=nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
}