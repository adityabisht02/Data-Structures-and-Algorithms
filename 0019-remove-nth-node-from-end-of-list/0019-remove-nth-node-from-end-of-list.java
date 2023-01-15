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
        //increment fast by n+1 , then move both dlow and fast till fast reaches null
        //the node in front of slow will be the node u want to remove
        
        ListNode start=new ListNode();
        start.next=head;
        ListNode slow=start,fast=start;
        
        for(int i=0;i<n+1;i++){
            if(fast!=null){
                fast=fast.next;
            }            
        }
        
        //now move both slow and fast
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        //remove node in front of slow
        slow.next=slow.next.next;
        
        //start.next will give new head
        return start.next;
    }
}