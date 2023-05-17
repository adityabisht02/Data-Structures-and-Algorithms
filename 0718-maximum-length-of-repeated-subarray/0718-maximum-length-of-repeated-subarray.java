class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int dp[][]=new int[nums1.length+1][nums2.length+1];
        
        for(int i=1;i<nums1.length+1;i++){
            for(int j=1;j<nums2.length+1;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                    
                }
                else{
                    //since we dont want breaks to propagate
                    dp[i][j]=0;
                }
            }
        }
        int max=0;
        //now find max element in dp that is the length of subarray
        for(int i=1;i<nums1.length+1;i++){
            for(int j=1;j<nums2.length+1;j++){
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }
        
        return max;
    }
}