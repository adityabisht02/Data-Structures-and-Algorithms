class Solution {
    public int getDist(String s1,String s2){
       int dp[][]=new int[s1.length()+1][s2.length()+1];
        //fill the array with starting values
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        
        //now the tabulation part
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+ Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
        
    }
    public int minDistance(String word1, String word2) {
        
        return getDist(word1,word2);
    }
}