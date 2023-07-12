class Solution {
    public int trap(int[] height) {
        //for every element we are calculating water on top of it
        //min of left and right - that element
        //if this is negative that means no water on top of that element
        int leftArr[]=new int[height.length];
        int rightArr[]=new int[height.length];
        int leftGreater=0;
        for(int i=0;i<leftArr.length;i++){
            leftArr[i]=leftGreater;
            if(height[i]>leftGreater){
                leftGreater=height[i];
            }
        }
        
        int rightGreater=0;
        for(int i=rightArr.length-1;i>=0;i--){
            rightArr[i]=rightGreater;
            if(height[i]>rightGreater){
                rightGreater=height[i];
            }
        }
        
        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            
            int waterHeight=Math.min(leftArr[i],rightArr[i]);
            if(waterHeight-height[i]>0){
                trappedWater+=waterHeight-height[i];
            }
        }
        return trappedWater;
    }
}