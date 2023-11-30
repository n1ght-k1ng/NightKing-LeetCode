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
    public ListNode middleNode(ListNode head)
    {
        ListNode s = head;
        ListNode f = head;
         while(f != null && f.next!=null)
         {
             s = s.next;
             f = f.next.next;
         }
        return s;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode pres = head;
        ListNode Next = head.next;
        while(pres!= null)
        {
            pres.next = prev;
            prev = pres;
            pres = Next;
            if(Next!= null)
            {
                Next = Next.next;
            }
        }
        head = prev;
        return head;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next==null)
        {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs  = reverse(mid);
        ListNode hf = head;
        while(hf != null && hs != null)
        {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            
            temp = hs.next;
            hs.next = hf;
            hs = temp;
            
        }
        if(hf!= null)
        {
            hf.next = null;
        }
    }
}

//     public int length(ListNode node) {
//         int len = 0;
//         while (node != null) {
//             len++;
//             node = node.next;
//         }
//         return len;
//     }

//     public ListNode reverse(ListNode head, int left, int right) {
//         if (head == null || left == right) {
//             return head;
//         }

//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode prev = dummy;

//         for (int i = 1; i < left; i++) {
//             prev = prev.next;
//         }

//         ListNode curr = prev.next;
//         ListNode next;
//         for (int i = left; i < right; i++) {
//             next = curr.next;
//             curr.next = next.next;
//             next.next = prev.next;
//             prev.next = next;
//         }

//         return dummy.next;
//     }

//     public void reorderList(ListNode head) {
//         if (head == null || head.next == null) {
//             return;
//         }

//         ListNode dummy = head;
//         int len = length(head);
//         int mid = len / 2;  // Fix: Use len / 2 instead of len / 2 + 1
//         head = reverse(head, mid + 1, len);

//         ListNode tail = head;

//         while (tail != null && tail.next != null) {
//             ListNode temp = dummy.next;
//             dummy.next = tail;
//             dummy = temp;
//             temp = tail.next;
//             tail.next = dummy;
//             tail = temp;
//         }
//     }
// }



    
//     public ListNode reverse(ListNode node){
//         if(node == null || node.next == null){
//             return node;
//         }
        
//         ListNode dummy = new ListNode(0);
//         dummy.next = node;
//         ListNode prev = dummy;
        
//         int len = length(node);
        
        
//     }
