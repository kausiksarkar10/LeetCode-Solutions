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

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // 1. Find length and tail
        int n = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // 2. Remove unnecessary rotations
        k = k % n;

        if (k == 0) {
            return head;
        }

        // 3. Make the list circular
        tail.next = head;

        // 4. Find the new tail
        int steps = n - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // 5. New head is after new tail
        ListNode newHead = newTail.next;

        // 6. Break the circle
        newTail.next = null;

        return newHead;
    }
}