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
        ListNode pA=headA,pB=headB;
        
        while(pA!=pB){
            pA=pA.next;
            pB=pB.next;
             //if no intersecton , they will both reach null
            if(pA==null && pB==null){
                return null;
            }
            
            if(pA==null){
                pA=headB;
            }
            if(pB==null){
                pB=headA;
            }
           
        }
        
        return pA;
    }
}