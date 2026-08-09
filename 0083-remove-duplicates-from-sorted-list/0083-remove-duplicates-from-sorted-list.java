/*public class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/

class Solution {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            if (temp.next != null && temp.val == temp.next.val) {
                temp.next = temp.next.next;

            } else {
                temp = temp.next;
            }

        }
        return head;

    }

    public static void PrintList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode Node1 = new ListNode(4);
        ListNode Node2 = new ListNode(2, Node1);
        ListNode Node3 = new ListNode(2, Node2);
        ListNode Node4 = new ListNode(1, Node3);
        ListNode head = Node4;
        PrintList(head);
        ListNode temp = deleteDuplicates(head);
        System.out.print("\n");
        PrintList(temp);
    }
}