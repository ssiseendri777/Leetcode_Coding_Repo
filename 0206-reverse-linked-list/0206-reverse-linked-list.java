// Definition for singly-linked list.
/*public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            temp = current.next; // store next node
            current.next = prev; // reverse pointer of current
            prev = current; // move prev forward
            current = temp; // move current forward
        }
        return prev; // new head
    }

    public static void printlist(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode head = n1;
        printlist(head);
        System.out.println("\nThe Reversed Linked List :");
        printlist(reverseList(head));
    }
}