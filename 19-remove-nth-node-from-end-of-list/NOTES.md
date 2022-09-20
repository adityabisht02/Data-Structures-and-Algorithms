//sometimes we need to delete head node so slow needs to start from a node before head
ListNode start=new ListNode(0);
start.next=head;
//fast and slow pointers
ListNode fast=start,slow=start;
//create a gap of n+1 between slow and fast
for(int i=1;i<=n+1;i++){
fast=fast.next;
}
//fast!=null so that slow is exactly n+1 steps behind
while(fast!=null){
slow=slow.next;
fast=fast.next;
}
//now delete the node after slow pointer
ListNode ptr=slow.next;
slow.next=ptr.next;
//head might get removed in some cases but start.next will always be head
return start.next;