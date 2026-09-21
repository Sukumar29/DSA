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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode a=head,b=head;
        while(b!=null&&b.next!=null){
            a=a.next;
            b=b.next.next;
        }
        ListNode sec=reverse(a);
        ListNode first=head;
        while(sec.next!=null){
            ListNode temp1=first.next;
            ListNode temp2=sec.next;
            first.next=sec;
            sec.next=temp1;
            first=temp1;
            sec=temp2;

        }
    }
    public ListNode reverse(ListNode a){
        ListNode prev=null;
        while(a!=null){
            ListNode next=a.next;
            a.next=prev;
            prev=a;
            a=next;
        }
        return prev;
    }
}