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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
// //         if(head.val == head.next.val){
// //             ListNode temp = head.next;
            
// //         }
//         if(head == null || head.next == null){
//             return head;
//         }
//            ListNode send = new ListNode(); 
//         ListNode res = send;
//         while(head != null){
//             if(head.next != null && head.next.val != head.val){
//                 res.next = new ListNode(head.val);
//                 res= res.next;
//                 head = head.next;
//             }
//             if(head.next.val != head.val){
//                 continue;
//             }
//             while(head.val == head.next.val){
//                 head = head.next;
//             }
//             head = head.next;

                

//             }
        
        
//         return send.next;
//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
            } else {
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}