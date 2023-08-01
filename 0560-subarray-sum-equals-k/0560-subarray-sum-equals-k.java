class Solution {
    public int subarraySum(int[] nums, int k) {
        int num=0,sum;
        
        for(int i=0;i<nums.length;i++){
            sum=0;
            
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    num++;
                }
            }
        }
        
        return num;
    }
}