class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for(int i=0;i<flowerbed.length;i++){
            boolean canPlant=true;
            if(flowerbed[i]==0){
                if(i-1 >=0){
                    if(flowerbed[i-1]==1){
                        canPlant=false;
                    }
                }
                if(i+1<flowerbed.length){
                    if(flowerbed[i+1]==1){
                        canPlant=false;
                    }
                }
            }else{
                canPlant=false;
            }
            
            if(canPlant){
                flowerbed[i]=1;
                n--;
            }
        }
        
        return (n<=0);
        
    }
}