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
        public int findLength(ListNode node){
        int len = 0;
        while(node != null){
            len+=1;
            node = node.next;
        }
        
        return len;
    }
        public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null || left == right){
            return head;
        }
        
        ListNode dummy1 = new ListNode(0);
        dummy1.next = head;
        ListNode prev = dummy1;
        
        for(int i = 1; i < left ; i++){
            prev = prev.next;
        } 
    //     if (prev.next == null) {
    //     return head;
    // }
        
        ListNode curr = prev.next;
        ListNode next;
        for(int i = left ; i < right && curr != null ; i++){
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        } //ncnp
        
        return dummy1.next;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
                if(head == null || k ==1 || k > findLength(head)){
            return head;
                    
        }      
        ListNode node = new ListNode();
        ListNode curr = head;
        for(int i = 0 ; i < k ; i++){
            ListNode next = curr.next;
            curr.next = node;
            node = curr;
            curr = next;
        }
        head.next = reverseKGroup(curr,k);
        return node;


//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode prev = dummy;
        
//         int limit = len/k;
//         int left = 1;
//         int right = k;
        
//         while(limit>0){
//             ListNode st = prev.next;
//             prev.next = reverseBetween(st , left , right);
//             prev = st;
//             left += k;
//             right += k;
//             limit--;
//         }
        
//         return dummy.next;
    }
}