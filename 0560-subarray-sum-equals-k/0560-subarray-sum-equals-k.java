class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefix=0,ans=0;
        
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int searchVal=prefix-k;
            if(map.containsKey(searchVal)){
                int counter=map.get(searchVal);
                ans+=counter;
            }
            if(map.containsKey(prefix)){
                int key=map.get(prefix);
                map.put(prefix,key+1);
            }
            else{
                map.put(prefix,1);
            }
        }
        return ans;
    }
}