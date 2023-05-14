class Solution {
    public String reverse(String s){
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        return ans;
    }
    public int getLCS(String s1,String s2,int i,int j,int dp[][]){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+getLCS(s1,s2,i+1,j+1,dp);
        }
        
        return dp[i][j]=Math.max(getLCS(s1,s2,i+1,j,dp),getLCS(s1,s2,i,j+1,dp));
    }
    public int longestPalindromeSubseq(String s) {
        
        String rev=reverse(s);
        int dp[][]=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        //basically calculate Longest common subsequence of s and reverse s
        return getLCS(s,rev,0,0,dp);
    }
}