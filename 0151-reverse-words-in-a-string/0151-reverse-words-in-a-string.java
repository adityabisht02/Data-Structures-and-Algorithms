class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack();
        String word="";
        int wordStart=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(wordStart!=-1){
                    stack.push(word);
                    word="";
                    wordStart=-1;
                }
            }
            else if(i==s.length()-1){
                if(wordStart!=-1){
                    word=word+s.charAt(i);
                    stack.push(word);
                }
                else{
                    if(s.charAt(i)!=' '){
                        word=word+s.charAt(i);
                        stack.push(word);
                    }
                }
            }
            else{
                //if character 
                if(s.charAt(i)!=' '){
                    //if new word is starting
                    if(wordStart==-1){
                        wordStart=i;
                        word=word+s.charAt(i);
                    }
                    //if word has already started
                    else{
                        word=word+s.charAt(i);
                    }
                }
            }
        }
        
        String ans="";
        while(!stack.isEmpty()){
            String temp=stack.pop();
            ans=ans+temp;
            ans=ans+" ";
        }
        return ans.trim();
    }
}