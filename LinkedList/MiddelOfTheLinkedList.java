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
    public int countNodes(ListNode head)
    {
        ListNode run=head;
        int c=0;
        while(run!=null)
        {
            c++;
            run=run.next;
        }
        return c;
    }
    public ListNode middleNode(ListNode head) {
       int n= countNodes(head);
       ListNode run=head;
       int i=0;
       while(i<=n/2)
       run=run.next;
       return head;
    }
}