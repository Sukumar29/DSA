/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node current=head;
        while(current!=null)
        {
            if(current.child!=null)
            {
                Node child=current.child;
                Node last=child;
                while(last.next!=null)
                {
                    last=last.next;
                }
                last.next=current.next;
                if(current.next!=null)
                {
                    current.next.prev=last;
                }
                current.next=child;
                child.prev=current;
                current.child=null;
            }
            current=current.next;
        }
        return head;
    }
}