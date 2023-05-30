class Solution {
       public static boolean isMergeable(int top[], int temp[]) {
        // ending index of top should be greater than starting index of temp for
        // mergeable
        return (top[1] >= temp[0]);
    }

 
    public int[][] insert(int[][] intervals, int[] newInterval) {
       
        List<int[]> list = new ArrayList<>();
        // copy array elements to list
        for (int i = 0; i < intervals.length; i++) {
            list.add(intervals[i]);

        }
        boolean wasIntervalAdded=false;
        // insert the new interval by checking start times
        for (int i = 0; i < list.size(); i++) {
            int temp[] = list.get(i);
            if (temp[0] > newInterval[0]) {
                list.add(i, newInterval);
                wasIntervalAdded=true;
                break;
            }
        }
        //if interval didnt get added add it to the end
        if(!wasIntervalAdded){
            list.add(newInterval);
        }

        Stack<int[]> s = new Stack();
        for (int i = 0; i < list.size(); i++) {
            int temp[] = list.get(i);
            if (s.isEmpty()) {
                s.push(temp);
            } else {
                int top[] = s.peek();
                // if is mergeable, remove old element and add new merged element
                if (isMergeable(top, temp)) {
                    s.pop();
                    int newel[] = new int[2];
                    newel[0] = top[0];
                    newel[1] = Math.max(top[1], temp[1]);
                    s.push(newel);
                }
                // if not mergeable then add the new element as well, the old one gets pushed
                // deeper and is never merged
                else {
                    s.push(temp);
                }
            }
        }
        int ans[][]=new int[s.size()][2];
        int index=ans.length-1;
        // npw print stack that would be all merged elements
        while (!s.isEmpty()) {
            int temp[] = s.pop();
            for(int i=0;i<2;i++){
                ans[index][i]=temp[i];
            }
            index--;
        }
        return ans;
        
    }
}