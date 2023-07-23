class Solution {
    public void rec(int arr[],int index,int target,List<Integer> temp,List<List<Integer>> ans){
        if(index>=arr.length){
            return ;
        }
        if(target<0){   
            return ;
        }
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        //take arr[index]
        temp.add(arr[index]);
        rec(arr,index,target-arr[index],temp,ans);
        temp.remove(temp.size()-1);
        rec(arr,index+1,target,temp,ans);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        
        rec(candidates,0,target,new ArrayList<>(),ans);
        return ans;
            
    }
}