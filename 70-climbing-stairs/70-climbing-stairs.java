class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int n0=1,n1=2,sum=0;        
        
        
        for(int i=3;i<=n;i++){
            sum=n1+n0;
            n0=n1;
            n1=sum;
        }
        
        return sum;
    }
}