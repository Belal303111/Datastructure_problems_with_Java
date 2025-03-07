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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode list3=new ListNode(0); //this is a teporary value set to difine the list3 and not return with the list
	ListNode run3=list3;
        ListNode run1=list1,run2=list2;
        while(run1!=null && run2!=null)
        {
            if(run1.val<run2.val)
            {
                run3.next=new ListNode(run1.val);
                run1=run1.next;
            }
            else{
                run3.next=new ListNode(run2.val);
                run2=run2.next;
            }
	      run3=run3.next;
        }
        while(run1!=null)
            {
            run3.next=new ListNode(run1.val);
            run1=run1.next;
            run3=run3.next;
            }
        while(run2!=null)
            {
                run3.next=new ListNode(run2.val);
                run2=run2.next;
                run3=run3.next;
            }
       return list3.next;
    }
}