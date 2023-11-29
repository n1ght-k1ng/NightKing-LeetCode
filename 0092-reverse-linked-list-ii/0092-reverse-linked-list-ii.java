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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null || left == right){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        for(int i = 1; i < left ; i++){
            prev = prev.next;
        }
        
        ListNode curr = prev.next;
        ListNode next;
        for(int i = left ; i <right ; i++){
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        } //ncnp
        
        return dummy.next;}
        
//         int toTraverse = right - left;
//         ListNode prev = null;
//         ListNode head2 = head;
//         int currleft = 1;
//         while(currleft != left){
//             prev = head;
//             head = head.next;
//             currleft++;
//         }
//         // ListNode prev = head2;
//         ListNode curr = head;
//         ListNode next = head.next;
//         int currTrav = 1;
//         for (int i = left; i < right; i++) {
//             next = curr.next;
//             curr.next = next.next;
//             next.next = prev.next;
//             prev.next = next;
//         }

//         return head2;
        
//     }
}