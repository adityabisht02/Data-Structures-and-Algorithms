class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();        
        map.put(0,1);
        int ans=0,prefix=0;
        
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int searchVal=prefix-k;
            
            if(map.containsKey(searchVal)){
                int count=map.get(searchVal);
                ans+=count;
            }
            if(map.containsKey(prefix)){
                int val=map.get(prefix);
                map.put(prefix,val+1);
            }
            else{
                map.put(prefix,1);
            }
        }
        return ans;
            
        }
    }
