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
    public ListNode sortList(ListNode head) {
        ListNode ptr=head;
        
        List<Integer> list=new ArrayList<>();
        
        while(ptr!=null){
            list.add(ptr.val);
            ptr=ptr.next;
        }
        Collections.sort(list);
        
        int index=0;
        ptr=head;
        
        while(ptr!=null){
            ptr.val=list.get(index);
            ptr=ptr.next;
            index++;
        }
        
        return head;
    }
}