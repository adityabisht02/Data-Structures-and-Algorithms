class Solution {
    public int countPrimes(int n) {
        //create sieve of eratosthenes
        int sieve[]=new int[n];
        
        for(int i=2;i<=Math.sqrt(n);i++){
            //if number is composite,dont use it to mark
            if(sieve[i]==1){
                continue;
            }
            for(int j=2;i*j<n;j++){
                int markingIndex=i*j;
                sieve[markingIndex]=1;
            }
        }
      
        int count=0;
        //traverse and find primes
        for(int i=2;i<n;i++){
            if(sieve[i]==0){
              count++;  
            }
        }
        return count;
    }
}