class Solution {
    public void sortColors(int[] nums) {
        int p1=0,p2=0,p3=nums.length-1;
        
        while(p2<=p3){
            if(nums[p2]==0){
                int temp=nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
                p1++;
                p2++;
            }
            else if(nums[p2]==2){
                int temp=nums[p3];
                nums[p3]=nums[p2];
                nums[p2]=temp;
                p3--;
            }
            else{
                p2++;
            }
        }
    }
}