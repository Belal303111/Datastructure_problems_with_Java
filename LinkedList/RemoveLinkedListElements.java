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
    public ListNode removeElements(ListNode head, int val) {
while(head!=null && head.val ==val) head=head.next;
   if(head==null) return null;
    ListNode curr=head,next=null;
    while(curr.next!=null)
   {
    next=curr.next;
    if(next.val==val)
    {
        next=next.next;
        curr.next=next;
    }
    else
    curr=curr.next;
   }
    return head;
    }
}
