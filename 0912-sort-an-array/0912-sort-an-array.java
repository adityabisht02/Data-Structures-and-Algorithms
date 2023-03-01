class Solution {
    public int[] merge(int left[],int right[]){
        int i=0,j=0,k=0;
        int merged[]=new int[left.length+right.length];
        
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k]=left[i];
                i++;
            }else{
                merged[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            merged[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            merged[k]=right[j];
            j++;
            k++;
        }
        
        return merged;
    }
    
    public int[] sortArray(int[] nums) {
        
        int low=0,high=nums.length-1;
        if(low>=high){
            return nums;
        }
        int mid=(high-low)/2+low;
        
        int leftarr[]=new int[mid+1];
        int rightarr[]=new int[high-mid];
        
        //fill elements in leftarr
        for(int i=0;i<leftarr.length;i++){
            leftarr[i]=nums[i];
        }
        
        for(int i=0;i<rightarr.length;i++){
            rightarr[i]=nums[mid+i+1];
        }
        
        int res1[]=sortArray(leftarr);
        int res2[]=sortArray(rightarr);
        
        return merge(res1,res2);        
        
    }
}