class Solution {
    public String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    public int getLCS(String s1,String s2){
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        
        for(int i=1 ;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public int minInsertions(String s) {
        String rev=reverse(s);
        int lcs=getLCS(s,rev);
        
        return (s.length()-lcs);
        
    }
}