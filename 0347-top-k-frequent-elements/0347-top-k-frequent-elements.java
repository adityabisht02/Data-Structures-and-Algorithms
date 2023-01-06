class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //firstly find number of occurences of each element
        HashMap<Integer,Integer> map=new HashMap();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int occurence=map.get(nums[i]);
                map.put(nums[i],occurence+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        //add all occurences to maxheap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int key:map.keySet()){
            pq.add(map.get(key));  //adding occurences
        }
        
        //getting top k occurences by popping k elements from map and storing them in array
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            int val=pq.poll();
            
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()==val){
                    ans[i]=entry.getKey();
                    map.remove(entry.getKey());
                    break;
                }
            }
        }
        
        
        return ans;
    }
}