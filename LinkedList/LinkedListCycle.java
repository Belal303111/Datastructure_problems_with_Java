/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode run1=head; //the slow node
	ListNode run2=head; //the fast node
        while(run2!=null && run2.next!=null && run1!=null)
        {
           run1= run1.next;
           run2=run2.next.next;
            if(run2==run1) return true;
        }
        return false;
    }
}