/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null){
            return null;
        }
        ListNode slow=head,fast=head;
        boolean hasCycle=false;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                hasCycle=true;
                break;
            }
        }
        
        //if no cycle
        if(!hasCycle){
            return null;
        }
        
        ListNode ptr=head;
        
        while(ptr!=slow){
            slow=slow.next;
            ptr=ptr.next;
        }
        
        return ptr;
        
    }
}