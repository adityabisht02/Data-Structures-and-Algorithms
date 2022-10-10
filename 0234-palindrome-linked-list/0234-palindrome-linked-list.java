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
    public ListNode reverse(ListNode head,ListNode slow){
        ListNode prev=null;
        ListNode ptr=head;
        ListNode next=head.next;
           
        while(prev!=slow){
            ptr.next=prev;
            prev=ptr;
            ptr=next;
            
            next=next.next;
        }
        
        return prev;
    }
    public boolean checkLists(ListNode ptr1,ListNode ptr2){
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val!=ptr2.val){
                return false;
            }
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        
        return (ptr1==null && ptr2==null);
    }
    
    public boolean isPalindrome(ListNode head) {
        
        //if single node
        if(head.next==null){
            return true;
        }
        
        //find middle node of the linked list
        ListNode slow=head,fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            if(fast==null || fast.next==null){
                break;
            }
            slow=slow.next;
        }
        
        ListNode temp;
        //even nodes
        if(fast==null){
            temp=slow.next;
        }
        //odd nodes
        else{
            temp=slow.next.next;
        }
        
        //reverse till slow
        slow=reverse(head,slow);
     
        System.out.println(slow.val);
        
        return checkLists(temp,slow);
    }
}