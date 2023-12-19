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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode nextPairStart = curr.next.next;

            // Swap nodes
            prev.next = curr.next;
            curr.next.next = curr;
            curr.next = nextPairStart;

            // Move pointers
            prev = curr;
            curr = nextPairStart;
        }

        return dummy.next;
    }
}