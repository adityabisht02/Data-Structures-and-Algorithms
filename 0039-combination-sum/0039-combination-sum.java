class Solution {
    public void comb(int index,int arr[],int target,List<List<Integer>> ans,List<Integer> temp){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
                
            }
            return ;
        }
        //if sum doesnt exceed target u can add element to list
        if(arr[index]<=target){
            temp.add(arr[index]);
            //call it again for same index
            comb(index,arr,target-arr[index],ans,temp);
            //remove that index as well
            temp.remove(temp.size()-1);
        }
        //increment index and take elements in front
        comb(index+1,arr,target,ans,temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        comb(0,candidates,target,ans,new ArrayList<>());
        
        return ans;
    }
}