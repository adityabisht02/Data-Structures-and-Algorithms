class Solution {
    public int helper(String s,int index,int dp[]){
        if(index>=s.length()){
            return 1;
        }
        if(s.charAt(index)=='0'){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        //takeOne
        int res=helper(s,index+1,dp);
        //taketwo
        if(index<s.length()-1 && (s.charAt(index)=='1' || s.charAt(index)=='2'&& s.charAt(index+1)<'7')){
            res+=helper(s,index+2,dp);
        }
        return dp[index]=res;
    }
    public int numDecodings(String s) {
        if(s.length()==0){
            return 0;
        }
        int dp[]=new int[s.length()];
        Arrays.fill(dp,-1);
        
        return helper(s,0,dp);
    }
}