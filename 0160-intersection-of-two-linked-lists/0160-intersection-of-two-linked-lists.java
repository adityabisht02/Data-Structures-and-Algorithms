/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA=headA,ptrB=headB;
        
        while(ptrA!=ptrB){
            if(ptrA==null){
                ptrA=headB;
            }
            if(ptrB==null){
                ptrB=headA;
            }
            //if after reseting they are equal
            if(ptrA==ptrB){
                break;
            }
            ptrA=ptrA.next;
            ptrB=ptrB.next;
        }
        
        return ptrA;
    }
}