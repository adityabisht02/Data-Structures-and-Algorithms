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
        if(head.next==null && n==1){
            return null;
        }
        
        if(n==0){
            return head;
        }
        
        ListNode ptr=head;
        int count=0;
        
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        
        count=count-n;
        int index=0;
        ptr=head;
        
        //if head needs to be removed
        if(count==0){
            head=head.next;
            return head;
        }
        
        while(index<count-1){
            index++;
            ptr=ptr.next;
        }
        
        ListNode p=ptr.next;
        ptr.next=p.next;
        
        
        return head;
    }
}