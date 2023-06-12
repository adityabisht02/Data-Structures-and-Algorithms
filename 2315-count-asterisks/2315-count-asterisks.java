class Solution {
    public int countAsterisks(String s) {
        Stack<Character> stack=new Stack();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                if(s.charAt(i)=='*'){
                    count++;
                }
                else if(s.charAt(i)=='|'){
                    stack.push(s.charAt(i));
                }
            }
            //if stack is not empty that means we are between a pair
            else{
                //pair complete
                if(s.charAt(i)=='|'){
                    stack.pop();
                }
            }
        }
        
        return count;
    }
}