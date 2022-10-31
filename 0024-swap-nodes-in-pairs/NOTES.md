1. Take head.next as the newhead (This is what you will return in the end).
2. Take a dummy node start and assign a current pointer to it, now your job is to reverse the next and next-next nodes of current on every step.
3. Also the previous link should also be connected by doing current.next=second.
4. After reversing on every step make current=current.next.next;
​