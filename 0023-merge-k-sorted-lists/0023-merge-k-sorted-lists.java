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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            //traverse the list
            while(head!=null){
                pq.add(head.val);
                head=head.next;
            }
        }
        
        //now use the heap to create a merged list
        ListNode start=new ListNode(0);
        ListNode ptr=start;
        while(!pq.isEmpty()){
            int temp=pq.poll();
            ListNode newnode=new ListNode(temp);
            ptr.next=newnode;
            ptr=ptr.next;
        }
        return start.next;
    }
}