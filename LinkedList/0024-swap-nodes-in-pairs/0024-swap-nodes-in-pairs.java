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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode current = head;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        while(count>=2){
            ListNode first = current;
            ListNode second = current.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
            current = first.next;
            count-=2;

        }
        return dummy.next;
    }
}