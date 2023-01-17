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
    public boolean isPalindrome(ListNode head) {
        
        //first use slow and fast pointer to find middle
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        //reverse the list till middle(till slow pointer)
        ListNode current=head.next;
        ListNode prev=null;
        
        while(head!=slow){
            head.next=prev;
            prev=head;
            head=current;
            if(current!=null){
                current=current.next;
            }
        }
        
        
        //now head of first list is prev
        
        //take head of the second list as slow if even list and slow.next if odd list
        
        //if odd list, slow.next will be second head
        if(fast!=null){
            if(fast.next==null){
            slow=slow.next;
        }
        }
        
        
        //now traverse prev and slow heads and compare
        while(prev!=null){
            if(prev.val!=slow.val){
                return false;
            }
            prev=prev.next;
            slow=slow.next;
        }
        
        return true;
    }
}