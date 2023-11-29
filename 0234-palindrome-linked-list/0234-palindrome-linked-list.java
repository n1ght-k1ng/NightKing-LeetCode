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
    
    public boolean isPalindrome(ListNode node) {
        if(node == null || node.next == null){
            return true;
        }
    
        int len = findLength(node);
        if(len ==2 && node.next.val != node.val){
            return false;
        }
        ListNode newList = reverse(node, len/2 +1, len);
        // while(newList != null){
        //     System.out.print(newList.val+" ");
        //     newList = newList.next;
        // }
        ListNode dummy = newList;
        int count = 1;
        while(count != (len/2 +1)){ //3
            newList = newList.next;
            count++;
        }
        // newList = newList.next;
        
        for(int i = 1 ; i < len/2+1 ; i++){
            
            if(dummy.val != newList.val){
                return false;
            }
            dummy = dummy.next;
            newList = newList.next;
        }
        return true;
        
    }
        ListNode reverse(ListNode head , int left , int right){
    
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
        
        return dummy.next;
            }
    }
    
