class Solution {
    public char findTheDifference(String s, String t) {
        int res1=0,res2=0;
        
        for(int i=0;i<s.length();i++){
            res1+=s.charAt(i);
        }
        
        for(int i=0;i<t.length();i++){
            res2+=t.charAt(i);
        }
        int ans=res2-res1;
        
        return (char)ans;
    }
}