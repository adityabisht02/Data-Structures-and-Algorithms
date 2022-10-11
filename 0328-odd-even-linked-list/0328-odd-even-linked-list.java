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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        int index=1;
        ListNode ptr=head;
        
        ListNode p1=new ListNode(0);
        ListNode p2=new ListNode(0);
        
        ListNode start2=p2;
        ListNode start1=p1;
        
        //traverse the list for odd elements
        while(ptr!=null){
            if(index%2 !=0){
                p1.next=ptr;
                p1=p1.next;
                
            }
            else{
                p2.next=ptr;
                p2=p2.next;
                 
            }
           index++;
            ptr=ptr.next;
        }
        
         p1.next=start2.next;
        p2.next=null;
        
        ptr=start1.next;
        while(ptr!=null){
            System.out.println(ptr.val);
            ptr=ptr.next;
        }
             
       
        
        return start1.next;
            
    }
}