/**
 * Definition for singly-linked list.
 */
/*public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}*/

class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node
        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        // Merge both lists
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Add remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void PrintList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode Node4 = new ListNode(5);
        ListNode Node3 = new ListNode(4, Node4);
        ListNode Node2 = new ListNode(3, Node3);
        ListNode Node1 = new ListNode(2, Node2);
        ListNode head1 = Node1;
        ListNode Noded = new ListNode(4);
        ListNode Nodec = new ListNode(3, Noded);
        ListNode Nodeb = new ListNode(2, Nodec);
        ListNode Nodea = new ListNode(1, Nodeb);
        ListNode heada = Nodea;
        ListNode result = mergeTwoLists(head1, heada);
        System.out.println("\n1st list");
        PrintList(head1);
        System.out.println("\n2nd list");
        PrintList(heada);
        System.out.println("\nMerged list");
        PrintList(result);
    }
}