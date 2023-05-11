class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    
    
        HashSet<List<Integer>> set=new HashSet();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int low=j+1;
                int high=nums.length-1;
                int target=-(nums[i]+nums[j]);
                while(low<=high){
                    int mid=(high-low)/2+low;
                    if(target==nums[mid]){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[mid]);
                        set.add(list);
                        break;
                    }
                    else if(target<nums[mid]){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                    
                }
            }
        }
        return new ArrayList<>(set);
        
        }
}