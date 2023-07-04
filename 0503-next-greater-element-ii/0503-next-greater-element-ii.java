class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            boolean nextGreaterFound=false;
            
            //find the next greater element
            for(int j=i+1;j<2*n;j++){
                int index=j%n;
                if(nums[index]>current){
                    ans[i]=nums[index];
                    nextGreaterFound=true;
                    break;
                }
                
            }
            //if not found put -1
            if(!nextGreaterFound){
               ans[i]=-1; 
            }
        }
        return ans;
    }
}