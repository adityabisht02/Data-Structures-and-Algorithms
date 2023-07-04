class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                //get the current occurence
                int occ=map.get(nums[i]);
                occ++;
                map.put(nums[i],occ);
            }
            else{
                //if new element
                map.put(nums[i],1);
            }
        }
        
        //traverse hashmap and find 1 occurence element
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}