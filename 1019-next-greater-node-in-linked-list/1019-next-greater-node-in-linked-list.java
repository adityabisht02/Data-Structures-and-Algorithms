/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int countNodes(ListNode head){
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
    public void fill(ListNode head,int arr[]){
        ListNode ptr=head;
        int index=0;
        while(ptr!=null){
            arr[index]=ptr.val;
            index++;
            ptr=ptr.next;
        }
    }
    class Pair{
        int val;
        int index;
        Pair(int v,int i){
            val=v;
            index=i;
        }
    }
    public int[] nextLargerNodes(ListNode head) {
        int n=countNodes(head);
        int arr[]=new int[n];
        fill(head,arr);
        Stack<Pair> s=new Stack();
        int ans[]=new int[n];
        for(int i=0;i<arr.length;i++){
            if(s.isEmpty()){
                s.push(new Pair(arr[i],i));
            }
            else{
                while(!s.isEmpty() && s.peek().val<arr[i]){
                    Pair temp=s.pop();
                    ans[temp.index]=arr[i];
                }
                s.push(new Pair(arr[i],i));
            }
            
        }
        //now empty the stack and mark the rwmaining elements
        while(!s.isEmpty()){
            Pair temp=s.pop();
            ans[temp.index]=0;
        }
        return ans;
        
    }
}