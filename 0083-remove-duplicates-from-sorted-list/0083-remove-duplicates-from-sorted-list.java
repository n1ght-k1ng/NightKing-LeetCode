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
    public ListNode deleteDuplicates(ListNode head) {
//         if(head.val == head.next.val){
//             ListNode temp = head.next;
            
//         }
        if(head == null){
            return head;
        }
        ListNode send = new ListNode(head.val);
        ListNode res = send;
        while(head.next != null){
            if(head.next.val == head.val){
                head = head.next;
                continue;
            }
            else{
                head = head.next;
                res.next = new ListNode(head.val);
                res= res.next;
            }
        }
        
        return send;
    }
}