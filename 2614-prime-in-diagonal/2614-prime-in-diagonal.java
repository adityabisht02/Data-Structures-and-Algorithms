class Solution {
    public void findPrimes(int primes[]){
        for(int i=2;i<Math.sqrt(primes.length);i++){
            int num=i;
            int mult=2;
            //mark all mutliples of i till primes.length
            while(num*mult<primes.length){
                int index=num*mult;
                primes[index]=1;
                mult++;
            }
        }
    }
    public int diagonalPrime(int[][] nums) {
        //first find max number in diagonals
        int max=Integer.MIN_VALUE;
        for(int i=0,j=0;i<nums.length && j<nums[0].length; i++,j++){
            if(nums[i][j]>max){
                max=nums[i][j];
            }
        }
        
        for(int i=0,j=nums[0].length-1;i<nums.length && j>=0;i++,j--){
            if(nums[i][j]>max){
                max=nums[i][j];
            }
        }
        
        int primes[]=new int[max+1];
        primes[0]=1;
        primes[1]=1;
        findPrimes(primes);
        int maxPrime=0;
            
         for(int i=0,j=0;i<nums.length && j<nums[0].length; i++,j++){
             int num=nums[i][j];
             if(primes[num]==0){
                 if(num>maxPrime){
                     maxPrime=num;
                 }
             }
             
        }
        
        for(int i=0,j=nums[0].length-1;i<nums.length && j>=0;i++,j--){
             int num=nums[i][j];
             if(primes[num]==0){
                 if(num>maxPrime){
                     maxPrime=num;
                 }
             }
        }
        return maxPrime;
    }
}