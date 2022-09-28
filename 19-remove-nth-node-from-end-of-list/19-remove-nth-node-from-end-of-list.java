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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode slow=start,fast=start;
        
        //first move fast n+1 steps ahead
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        
        //now move slow and fast both till fast is null
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        //now remove node in front of slow
        slow.next=slow.next.next;
        
        return start.next;
        
    }
}