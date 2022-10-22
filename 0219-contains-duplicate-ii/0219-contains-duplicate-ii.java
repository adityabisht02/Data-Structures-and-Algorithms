class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //map of element to index
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            //if duplicate
            if(map.containsKey(nums[i])){
                //check if index diff< k
                int index=map.get(nums[i]);
                if(i-index<=k){
                    return true;
                }
                map.put(nums[i],i);                    
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return false;
    }
}