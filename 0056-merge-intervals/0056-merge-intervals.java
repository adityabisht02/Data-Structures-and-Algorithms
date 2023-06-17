class Solution {
    public boolean isMergeable(int arr1[],int arr2[]){
        return (arr1[1]>=arr2[0]);
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(el1,el2)->Integer.compare(el1[0],el2[0]));
        Stack<int[]> s=new Stack();
        
        for(int i=0;i<intervals.length;i++){
            int temp[]=intervals[i];
            if(s.isEmpty()){
                s.push(temp);
            }
            else{
                int top[]=s.peek();
                if(isMergeable(top,temp)){
                    s.pop();
                    int newarr[]=new int[2];
                    newarr[0]=top[0];
                    newarr[1]=Math.max(top[1],temp[1]);
                    s.push(newarr);
                }
                else{
                    s.push(temp);
                }
            }
        }
        
        int ans[][]=new int[s.size()][2];
        int index=ans.length-1;
        while(!s.isEmpty()){
            int temp[]=s.pop();
            ans[index][0]=temp[0];
            ans[index][1]=temp[1];
            index--;
        }
        
        return ans;
    }
}