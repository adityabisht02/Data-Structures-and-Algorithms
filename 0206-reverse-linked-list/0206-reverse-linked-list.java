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
    public ListNode reverseList(ListNode head) {
        //write base cases
        if(head==null || head.next==null){
            return head;
        }
        //go till the end to find the new head and keep returning it through recursion stack
        ListNode newhead=reverseList(head.next);
        
        //reverse links
        head.next.next=head;
        //to make the end node null keep making head.next=null
        head.next=null;
        return newhead;
    }
}