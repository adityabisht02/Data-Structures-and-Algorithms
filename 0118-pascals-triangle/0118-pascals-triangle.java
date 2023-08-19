class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans=new ArrayList<>();
        
        for(int row=1;row<=numRows;row++){
            List<Integer> list=new ArrayList<>();
            if(row==1){
                list.add(1);
            }
            else{                
                for(int col=0;col<row;col++){
                    if(col==0 || col==row-1){
                        list.add(1);
                    }
                    else{
                        int val=ans.get(row-1-1).get(col)+ans.get(row-1-1).get(col-1);
                        list.add(val);
                    }
                }
            }
            ans.add(list);
        }
        
        return ans;
    }
}