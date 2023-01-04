class Solution {
    public int minimumRounds(int[] tasks) {
        //make a hashmap of difficulty to count
        HashMap<Integer,Integer> map=new HashMap();
        
        //put number of times each task occurs
        for(int i=0;i<tasks.length;i++){
            //if map contains key then increment value
            if(map.containsKey(tasks[i])){
                int currentValue=map.get(tasks[i]);
                map.put(tasks[i],currentValue+1);
            }
            //new task
            else{
                map.put(tasks[i],1);
            }
        }
        
        
        int rounds=0;
        
        // if number of occurence is 1, then return -1 , if anything other than 1 it can be achieved with combination of 2 and 3
        //hence if not 1 keep dividing by 3 and 2 for remaining
        
        for(int key: map.keySet()){
            int occurence=map.get(key);
            //if occurence 1 return -1
            if(occurence==1){
                return -1;
            }
            if(occurence%3==0 || occurence%3==2){
            rounds+=occurence/3;
                occurence=occurence%3;
             
            }
            if(occurence%3==1){
              rounds+=  occurence/3-1;
                occurence=4; //remaining occurences will always be 4
            }
            if(occurence%2==0 ){   //at this point we will only have 2 or 0 or 4 left
                rounds+=occurence/2;
            }
            
        }
        
        return rounds;
        
        
        
    }
}