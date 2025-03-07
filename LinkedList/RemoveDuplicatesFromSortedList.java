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
        if(head==null) return null;
        ListNode run=head;
       while(run!=null && run.next!=null)
       {
        if(run.val==run.next.val)
         run.next=run.next.next;
         else
         run=run.next;
       }
        return head;
    }
}