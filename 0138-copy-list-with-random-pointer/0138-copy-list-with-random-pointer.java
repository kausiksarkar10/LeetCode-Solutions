/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Node curr = head;

        // Step 1: Insert copied node after every original node
        while (curr != null) {

            Node copy = new Node(curr.val);

            copy.next = curr.next;
            curr.next = copy;

            curr = copy.next;
        }

        // Step 2: Set random pointers of copied nodes
        curr = head;

        while (curr != null) {

            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }

            curr = curr.next.next;
        }

        // Step 3: Separate original and copied lists
        Node dummy = new Node(0);
        Node copyCurr = dummy;

        curr = head;

        while (curr != null) {

            Node copy = curr.next;

            // Restore original list
            curr.next = copy.next;

            // Connect copied list
            copyCurr.next = copy;
            copyCurr = copy;

            curr = curr.next;
        }

        return dummy.next;
    }
}