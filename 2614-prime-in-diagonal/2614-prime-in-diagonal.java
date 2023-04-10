class Solution {
    public void findAllPrimes(int sieve[]){
   

        for (int i = 2; i < Math.sqrt(sieve.length); i++) {
            int num = i;
            int temp = 2;
            // num will give index of element to be marked
            while (num * temp < sieve.length) {
                int index = num * temp;
                // mark
                sieve[index] = 1;
                temp++;
            }

        }

        
    }
    public int diagonalPrime(int[][] nums) {
        
        //find max among diagonals
         //now traverse diagonals and check
        int max=Integer.MIN_VALUE;
        for(int i=0,j=0;i<nums.length&&j<nums[0].length;i++,j++){
            int temp=nums[i][j];
            if(temp>max){
                max=temp;
            }
        }
        //traverse reverse diagonal
        for(int i=0,j=nums[0].length-1;i<nums.length&&j>=0;i++,j--){
            int temp=nums[i][j];
            if(temp>max){
                max=temp;
            }
            
        }
        
        
        
        int sieve[]=new int[max+1];
        //since 0 and 1 are neither prime nor composite
        sieve[0]=1;
        sieve[1]=1;
        findAllPrimes(sieve);
        int maxPrime=0;
        //now traverse diagonals and check
        for(int i=0,j=0;i<nums.length&&j<nums[0].length;i++,j++){
            int temp=nums[i][j];
            if(sieve[temp]==0){
                if(temp>maxPrime){
                    maxPrime=temp;
                }
            }
        }
        //traverse reverse diagonal
        for(int i=0,j=nums[0].length-1;i<nums.length&&j>=0;i++,j--){
            int temp=nums[i][j];
            if(sieve[temp]==0){
                if(temp>maxPrime){
                    maxPrime=temp;
                }
            }
        }
        
        return maxPrime;
    }
}