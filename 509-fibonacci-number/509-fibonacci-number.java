class Solution {
    public int rec(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return rec(n-1)+rec(n-2);
    }
    
    public int fib(int n) {
       if(n==0 || n==1){
           return n;           
       }
        
       return rec(n);
        
    }
}