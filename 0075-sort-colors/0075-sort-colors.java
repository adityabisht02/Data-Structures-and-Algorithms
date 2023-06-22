class Solution {
    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int p0=0,p1=0,p2=nums.length-1;
        
        //swapping depends on the value of p1 only
        while(p1<=p2){
            if(nums[p1]==0){
                swap(nums,p0,p1);
                p0++;
                p1++;
            }
            else if(nums[p1]==1){
                p1++;
            }
            else if(nums[p1]==2){
                swap(nums,p1,p2);
                p2--;
            }
        }
    }
}