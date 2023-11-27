/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if (head == null || head.next == null) {
            return null;
        }
        ListNode copy = head;
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        int index = 0;
        while(copy != null){
            do{
                if (slow == copy){
                    return copy;
                }
                slow = slow.next;
            }while(slow != fast);
            copy = copy.next;
        }
        
        return null;

        
        

    }
}
