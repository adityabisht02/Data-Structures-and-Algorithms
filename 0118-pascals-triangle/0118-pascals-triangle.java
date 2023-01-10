class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowlist=new ArrayList<>();
        List<Integer> row,pre=null;
        
        for(int i=0;i<numRows;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                //if j is first or last element of row
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int temp=pre.get(j-1)+pre.get(j);
                    row.add(temp);
                }
            }
            rowlist.add(row);
            pre=row;
        }
        
        return rowlist;
    }
}