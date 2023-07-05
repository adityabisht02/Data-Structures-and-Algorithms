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
        if(head==null || head.next==null){
            return head;
        }
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        ListNode ptr=head;
        while(ptr!=null){
            int current=ptr.val;
            if(map.containsKey(current)){
                int occurence=map.get(current);
                occurence++;
                map.put(current,occurence);
            }
            else{
                map.put(current,1);
            }
            ptr=ptr.next;
        }
        
        ListNode start=new ListNode(0);
        start.next=head;
        ListNode p=start;
        ptr=head;
        
        while(ptr!=null){
            int current=ptr.val;
            //check if current has occurence of more than 1
            int occurence=map.get(current);
            if(occurence==1){
                p.next=ptr;
                p=p.next;
            }
            ptr=ptr.next;
        }
        if(p==start){
            return null;
        }
        p.next=null;
        return start.next;
    }
}