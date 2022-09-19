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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode list3=new ListNode();
        
        ListNode p1=list1,p2=list2,p3=list3;
        
        while(p1!=null && p2!=null){
            
            ListNode newnode=new ListNode();
            
            if(p1.val<=p2.val){
                newnode.val=p1.val;
                p3.next=newnode;
                p3=p3.next;
                p1=p1.next;
            }
            else{
                 newnode.val=p2.val;
                p3.next=newnode;
                p3=p3.next;
                p2=p2.next;
            }
            
        }
        
        //p1 not complete
        while(p1!=null){
            ListNode newnode=new ListNode(p1.val);
            p3.next=newnode;
            p3=p3.next;
            p1=p1.next;
        }
        
         //p2 not complete
        while(p2!=null){
            ListNode newnode=new ListNode(p2.val);
            p3.next=newnode;
            p3=p3.next;
            p2=p2.next;
        }
        
        return list3.next;
    }
}