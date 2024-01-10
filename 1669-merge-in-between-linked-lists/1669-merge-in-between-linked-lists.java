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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        int count = 0;
        ListNode dummy = new ListNode(0);
        ListNode res = new ListNode(0);
        res.next = list1;
        dummy.next = list1;
        while(count!= b && list1.next != null){
            count++;
            list1 = list1.next;
        }
        ListNode add2 = new ListNode(2);
        add2.next = list1.next;
        add2 = add2.next;
        count = 0;
        while(count!= a && dummy.next != null){
            count++;
            dummy = dummy.next;
        }
        ListNode l2 = new ListNode(0);
        l2.next = list2;
        while(l2.next != null)
            l2 = l2.next;
        l2.next = add2;
        dummy.next = list2;
        
        return res.next;
        
        
    }
}