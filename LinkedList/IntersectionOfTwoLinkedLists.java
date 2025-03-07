/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int count(ListNode head)
    {
        int c=0;
        ListNode run=head;
        while(run!=null)
        {
            c++;
            run=run.next;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if(headA==headB)
       return headA;
      int len1= count(headA),len2=count(headB);
       ListNode run1=headA,run2=headB;
      int d=0;
      if(len1>len2) {
        d=len1-len2;
        int i=0;
        while(i<d)
         {
            run1=run1.next;
            i++;
         }
      }
      else {
        d=len2-len1;
        int i=0;
        while(i<d)
         {
            run2=run2.next;
            i++;
         }
      }
       while(run1!=null && run2!=null)
       {
        if(run1==run2) return run1;
        run1=run1.next;
        run2=run2.next;
       }
       return null;
    }
}