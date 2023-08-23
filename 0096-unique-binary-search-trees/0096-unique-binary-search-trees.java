class Solution {
    public int helper(int n){
        if(n<=1){
            return 1;
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+= helper(i-1)*helper(n-i);         
        }
        return ans;
    }
    public int numTrees(int n) {
        return helper(n);
    }
}