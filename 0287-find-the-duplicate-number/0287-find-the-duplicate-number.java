class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            //if element is marked, return element else mark element as visited
            if(nums[num]<0){
                return num;
            }
            else{
                nums[num]=-nums[num];
            }
        }
        
        return -1;
    }
}