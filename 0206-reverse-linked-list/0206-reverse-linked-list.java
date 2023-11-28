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
    
   
    public ListNode reverseList(ListNode head) {
        // if(head == null || head.next == null){
        //     return head;
        // }
        // else{
        //     ListNode rev = reverseList(head.next);
        //     head.next.next = head;
        //     head.next = null;
        //     return rev;
        // }
        
        
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
            // newNode.next = curr;
            // curr.next = prev;
            // prev = curr;
        }
        
        return prev;
        
        
        
     
    }
}