class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack();
        
        for(int i=0;i<asteroids.length;i++){
            int el=asteroids[i];
            
            if(s.isEmpty()){
                s.push(el);
            }
            else{
                //if top is negative , it will go left no matter what
                if(s.peek()<0){
                    s.push(el);
                }
                //if top +ve , 2 conditions
                else{
                    if(el>0){
                        s.push(el);
                    }
                    //if new el -ve,pop top till destruction is finished
                    else{
                        while(s.peek()>0 && s.peek()<Math.abs(el)){
                            s.pop();
                            if(s.isEmpty()){
                                break;
                            }
                        }
                        
                        if(s.isEmpty()){
                            s.push(el);
                        }  
                        else if(s.peek()==Math.abs(el)){
                                s.pop();
                        }
                        else if(s.peek()<0){
                            s.push(el);
                        }
                        
                    }
                }
            }
        }
        
        int ans[]=new int[s.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=s.pop();
        }
        
        return ans;
    }
}