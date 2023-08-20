class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }
            else{
                List<Integer> temp=new ArrayList<>();
                temp.add(i);
                map.put(arr[i],temp);
            }
        }
        //map also serves as visited array
        
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        int jumps=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
               int index=q.poll();
                if(index==arr.length-1){
                    return jumps;
                }
                //add index+1
                if(index!=arr.length-1 && map.containsKey(arr[index+1])){
                    q.add(index+1);
                }
                if(index!=0 && map.containsKey(arr[index-1])){
                    q.add(index-1);
                }
                if(map.containsKey(arr[index])){
                    List<Integer> indexes=map.get(arr[index]);
                    for(Integer j:indexes){
                        if(j!=index){
                            q.add(j);
                        }
                    }
                   
                }
                 map.remove(arr[index]);
            }
            
            
            jumps++;
        }
        return jumps;
    }
}