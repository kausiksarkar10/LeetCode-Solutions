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
        if(head==null){
            return head;
        }
        ListNode dummy =new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        ListNode q=head;

        while(q!=null){
            if(q.next!=null && q.val==q.next.val){
                int duplicate=q.val;
                while(q!=null && q.val==duplicate){
                    q=q.next;
                }
                p.next=q;
            }
            else{
                p=q;
                q=q.next;
            }
        }
        return dummy.next;
    }
}