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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode start=new ListNode(0);
        start.next=head;
        
        ListNode slow=start;
        ListNode fast=start;
        
        //after this loop fast will be on the node which is k from the front
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        ListNode firstNode=fast;        
        
        //after this loop slow will be on the node which is k from the end
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        //now swap values
        int temp=firstNode.val;
        firstNode.val=slow.val;
        slow.val=temp;
        
        return head;
        
    }
}