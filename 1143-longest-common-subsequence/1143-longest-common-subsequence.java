class Solution {
    public int lcs(String s1,String s2,int i,int j,int dp[][]){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+ lcs(s1,s2,i+1,j+1,dp);
        }
        
        //if characters are not equal
        return dp[i][j]=Math.max(lcs(s1,s2,i+1,j,dp),lcs(s1,s2,i,j+1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        return lcs(text1,text2,0,0,dp);
    }
}