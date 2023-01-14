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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ListNode ptr=null;
        
        for(int i=0;i<lists.length;i++){
             ptr=lists[i];
            
            //loop through lists[i] and add all elements to heap
            while(ptr!=null){
                pq.add(ptr.val);
                ptr=ptr.next;
            }
        }
        
        //if minheap empty return null list
        if(pq.isEmpty()){
            return null;
        }
        ListNode start=new ListNode();
        ptr=start;
        
        //poll minheap elements and create a new list
        while(!pq.isEmpty()){
            ListNode newnode=new ListNode(pq.poll());
            start.next=newnode;
            start=start.next;
        }
        
        return ptr.next;
        
    }
}