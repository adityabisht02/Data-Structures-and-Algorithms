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
  
    public int[] nextLargerNodes(ListNode head) {
        int n=countNodes(head);
        int arr[]=new int[n];
        fill(head,arr);
       int ans[]=new int[n];
        Stack<Integer> s=new Stack();
        
        for(int i=arr.length-1;i>=0;i--){
             if(i==arr.length-1){
                 ans[i]=0;
                 s.push(arr[i]);
             }
           else if(s.isEmpty()){
                s.push(arr[i]);
            }
            else{
                while(!s.isEmpty() && s.peek()<=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=0;
                }
                else{
                    ans[i]=s.peek();
                }
                s.push(arr[i]);
            }
        }
        return ans;
    }
}