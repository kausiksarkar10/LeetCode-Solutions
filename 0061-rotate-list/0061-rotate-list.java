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
        int length=0;
        if(head==null){
            return null;
        }
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(k%length==0){
            return head;
        }
        int steps=k%length;
        ListNode newHead=head;
        ListNode prevNodeOfnewHead=head;
        for(int i=0;i<length-steps-1;i++){
            newHead=newHead.next;
            prevNodeOfnewHead = prevNodeOfnewHead.next;
        }
        ListNode newHeadPointer=newHead.next;
        
        
        while(newHead.next!=null){
            newHead=newHead.next;
        }
        prevNodeOfnewHead.next=null;
        newHead.next=head;

        return newHeadPointer;
        
    }
}