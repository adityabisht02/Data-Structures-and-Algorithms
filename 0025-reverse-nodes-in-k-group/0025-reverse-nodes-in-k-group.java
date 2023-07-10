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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null,current=head.next,endnode=head;
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode ptr=start;
        
        while(head!=null){
            prev=null;
            current=head.next;
            endnode=head;
            for(int i=0;i<k;i++){
                //if endnode is null we cant go further then connect list with head and return
                if(endnode==null){
                    ptr.next=head;
                    return start.next;
                }
                endnode=endnode.next;
            }
            //reverse the list
            while(head!=endnode){
                head.next=prev;
                prev=head;
                head=current;
                if(current!=null){
                    current=current.next;
                }
            }
            //connect the reverse list to other lists
            //prev is the new head
            ptr.next=prev;
            while(ptr.next!=null){
                ptr=ptr.next;
            }
        }
        return start.next;
    }
}