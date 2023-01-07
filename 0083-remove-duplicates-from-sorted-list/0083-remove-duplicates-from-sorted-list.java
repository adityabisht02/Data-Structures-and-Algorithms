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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        
        HashSet<Integer> set=new HashSet();
        
        ListNode p1=head;
        ListNode p2=head.next;
        
        //since list is sorted we need to check adjacent values
        while(p2!=null){
            
            if(p1.val==p2.val){
                p1.next=p2.next;
                p2=p1.next;
                continue;
            }
            
            p1=p1.next;
            if(p2!=null){
                  p2=p2.next;
            }
          
        }
        
        return head;
        
        
    }
}