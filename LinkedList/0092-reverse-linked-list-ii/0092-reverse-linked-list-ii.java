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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode leftprev = dummy;
        ListNode current=head;

        for (int i = 0; i < left - 1 ; i++) {
            leftprev = leftprev.next;
            current=current.next;
        }
        ListNode SubListHead = current;
        ListNode prev=null;
        for (int i = 0; i <= right - left; i++) {
            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current=next;
        }
        leftprev.next=prev;
        SubListHead.next=current;
        return dummy.next;
    }
}