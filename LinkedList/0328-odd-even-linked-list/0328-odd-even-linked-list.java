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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }


        ListNode oddHead=head;
        ListNode evenHead=oddHead.next;

        ListNode evenHeadpointer=evenHead;

        while(oddHead.next!=null && evenHead.next!=null){

            if(oddHead.next!=null){
                oddHead.next=oddHead.next.next;
                oddHead=oddHead.next;
            }
            if(evenHead.next!=null){
                evenHead.next=evenHead.next.next;
                evenHead=evenHead.next;
            }
        }
        oddHead.next=evenHeadpointer;
        return head;
    }
}