class Solution {
    public boolean isMergeable(int top[],int temp[]){
         return (temp[0]<top[1]);
    }
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals,(el1,el2)->{
           int cmp=Integer.compare(el1[0],el2[0]);
           if(cmp==0){
               return Integer.compare(el1[1],el2[1]);
           }
           return cmp;
       }) ;
        int count=0;
        Stack<int[]> s=new Stack();
        s.push(intervals[0]);
        
        for(int i=1;i<intervals.length;i++){
            if(s.isEmpty()){
                s.push(intervals[i]);
            }
            int top[]=s.peek();
            int temp[]=intervals[i];
            if(!isMergeable(top,temp)){
                s.push(temp);
            }
            else{
                //if mergeable check whose starting time is larger remove that one
                if(top[1]>temp[1]){
                    s.pop(); //remove top
                    s.push(temp);
                }
                //if temp[1] is larger dont add it
                count++;
            }
            
        }
        return count;
    }
}