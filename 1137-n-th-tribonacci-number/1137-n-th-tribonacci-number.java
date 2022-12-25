class Solution {
    public int rec(int trib[],int n){
        if(n==0 || n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        if(trib[n]!=0){
            
            return trib[n];
        }
        return trib[n]=rec(trib,n-1)+rec(trib,n-2)+ rec(trib,n-3);
    }
    
    public int tribonacci(int n) {
        int trib[]=new int[n+1]; //to account for 0 as well
        
        return rec(trib,n);       
        
    }
}