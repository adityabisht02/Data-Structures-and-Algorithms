class Solution {
    public int getLCS(String s1,String s2, int i,int j,int dp[][]){
        if(i>=s1.length() || j>=s2.length()){
            return 0;
        }
        //if exists in dp array
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        //if both char equal, increment both pointer
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+getLCS(s1,s2,i+1,j+1,dp);
        }
        
        //else i and j are not equal, take both i+1,j and j+1,i cases and return max
        
        return dp[i][j]=Math.max( getLCS(s1,s2,i+1,j,dp),getLCS(s1,s2,i,j+1,dp) );
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()][text2.length()];
        
        //lcs can be 0 so fill dp array with -1
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                dp[i][j]=-1;
            }
        }
        return getLCS(text1,text2,0,0,dp);
    }
}