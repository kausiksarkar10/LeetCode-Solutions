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
        Node orig=head;
        if(head==null){
            return null;
        }
        while(orig!=null){
            Node copy=new Node(orig.val);
            copy.next=orig.next;
            orig.next=copy;
            orig=orig.next.next;
        }
        orig=head;
        while(orig!=null){
            if(orig.random!=null){
            orig.next.random=orig.random.next;
            }
            orig=orig.next.next;
        }
        Node copyHead=head.next;
        orig=head;
        while(orig!=null){
            Node copy=orig.next;
            orig.next=copy.next;

            if(copy.next!=null){
                copy.next=copy.next.next;
            }
            orig=orig.next;
        }
        return copyHead;
    }
}