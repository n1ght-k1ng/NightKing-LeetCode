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
    
    ListNode rev = new ListNode();
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        else{
            ListNode rev = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return rev;
        }
        
        
     
    }
}