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
import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        String num = "";
        while(head != null){
            num+= String.valueOf(head.val);
            head = head.next;
        }
        System.out.println(num);
        ListNode ret = new ListNode(0);
        ListNode dummy = ret;
        BigInteger bigNum = new BigInteger(num);
        BigInteger result = bigNum.multiply(BigInteger.valueOf(2));
        
        
        num = result.toString();
        for(int i = 0 ; i < num.length() ; i++){
            ListNode n = new ListNode((int) num.charAt(i) - '0');
            ret.next = n;
            ret = ret.next;
        }
        
        return dummy.next;
        
        
        
    }
}