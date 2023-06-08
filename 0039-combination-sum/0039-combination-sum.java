class Solution {
    public void rec(List<List<Integer>> ans,List<Integer> list, int arr[],int index,int target){
        if(index>=arr.length || target<=0){
            return ;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            if(arr[index]==target){
                ans.add(new ArrayList(list));
            }
            rec(ans,list,arr,index,target-arr[index]);
            list.remove(list.size()-1);
        }
        rec(ans,list,arr,index+1,target);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        rec(ans,new ArrayList<>(),candidates,0,target);
            return ans;
    }
}