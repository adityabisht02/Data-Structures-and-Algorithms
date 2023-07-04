class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        
         for(int i=0;i<nums1.length;i++){
             int current=nums1[i];
             for(int j=0;j<nums2.length;j++){
                 if(nums2[j]==current){
                    boolean greaterFound=false;
                 for(int k=j+1;k<nums2.length;k++){
                     if(nums2[k]>current){
                         ans[i]=nums2[k];
                          greaterFound=true;
                         break;
                     }
                 }
                 if(!greaterFound){
                     ans[i]=-1;
                 } 
                 }
                 
             }
         }
        return ans;
    }
}