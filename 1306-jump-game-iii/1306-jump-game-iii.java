class Solution {
    public boolean rec(int arr[],boolean vis[],int index){
        if(index>=arr.length || index<0){
            return false;
        }
        //if index has been visited
        if(vis[index]){
            return false;
        }
        if(arr[index]==0){
            return true;
        }
        vis[index]=true;
        int num=arr[index];
        return (rec(arr,vis,index-num) || rec(arr,vis,index+num));
    }
    public boolean canReach(int[] arr, int start) {
        boolean vis[]=new boolean[arr.length];
        
        return rec(arr,vis,start);
    }
}