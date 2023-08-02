class Solution {
    public int minJumps(int[] arr) {
         HashMap<Integer,List<Integer>> map=new HashMap<>();
        int ans=0;
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
             map.computeIfAbsent(arr[i], v -> new ArrayList()).add(i);
        }
        q.add(0);
     
        while(!q.isEmpty()){
            int size=q.size();
            for(int k=0;k<size;k++){
                int index=q.poll();
                if(index==arr.length-1){
                    return ans;
                }
                if(index!=0 && map.containsKey(arr[index-1])){
                   
                        q.offer(index-1);
                    
                    
                }
                if(index!=arr.length-1 && map.containsKey(arr[index+1])){
                   
                        q.offer(index+1);
                     
                    
                }
                if(map.containsKey(arr[index])){
                   List<Integer> sameVals=map.get(arr[index]);
                for(int i=0;i<sameVals.size();i++){
                    int tempIndex=sameVals.get(i);
                    if(tempIndex!=index && map.containsKey(arr[index])) {
                        q.offer(tempIndex);
                       
                    }
                } 
                }
                
                map.remove(arr[index]);
            }
            ans++;
            
        }
        return ans;
        
    }
}