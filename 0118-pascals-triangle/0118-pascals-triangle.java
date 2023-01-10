class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rowlist=new ArrayList<>();
        List<Integer> row;
        List<Integer> previousRow;
        int temp;
        
        for(int i=0;i<numRows;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    previousRow=rowlist.get(i-1);
                    temp=previousRow.get(j)+ previousRow.get(j-1);
                    row.add(temp);                    
                }
            }
            rowlist.add(row);
        }
        
        return rowlist;
    }
}