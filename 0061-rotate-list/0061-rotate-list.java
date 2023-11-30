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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0 || head.next ==null){
            return head;
        }
        int len = findLength(head);
        if(k > len){
            k = k%len;
        }
        if(k == 0){
            return head;
        }
        ListNode tail = new ListNode(0);
        while(k>0){
            ListNode start = head;
            while (head.next.next !=null){
                head = head.next;
            }
            tail = head.next;
            head.next = null;
            tail.next = start;
            head = tail;
            k--;
        }
        return tail;
    }
}