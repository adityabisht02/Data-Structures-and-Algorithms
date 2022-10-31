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
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next==null){
            return head;
        }
        
        ListNode current=new ListNode(0);    
        current.next=head;
        //newhead will be returned at end
        ListNode newhead=current;
        
        while(current.next!=null && current.next.next!=null )   // for even and odd lists respectively
        {
            ListNode first=current.next;
            ListNode second=current.next.next;
            
            first.next=second.next;
            second.next=first;            
            current.next=second;
            
            current=current.next.next;   //it wont be null cause otherwise we wouldnt be in this loop
        }
        
        return newhead.next;
    }
}