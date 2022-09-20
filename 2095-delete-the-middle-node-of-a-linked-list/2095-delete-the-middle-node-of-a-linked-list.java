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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ){
            return head;
        }
        if(head.next==null){
            return null;
        }
        ListNode fast=head,slow=head;
        
        //finding the middle node
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //deleting middle node
        ListNode ptr=head;
        while(ptr.next!=slow){
            ptr=ptr.next;
        }
        ptr.next=slow.next;
        
        
        return head;
        
    }
}