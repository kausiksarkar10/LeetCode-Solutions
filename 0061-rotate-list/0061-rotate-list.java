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
    public ListNode rotateRight(ListNode head, int k) {
        int length=1;
        ListNode temp=head;
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        if(k%length==0){
            return head;
        }
        k=k%length;
        temp.next=head;
        ListNode newtail=head;
        int step=length-k;
        for(int i=1;i<step;i++){
            newtail=newtail.next;
        }
        ListNode temp1=newtail.next;
        newtail.next=null;
        return temp1;
    }
}