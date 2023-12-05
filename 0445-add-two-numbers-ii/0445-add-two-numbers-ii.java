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
    int c=0;
    Stack<ListNode> makeStack(ListNode l, int k){
        Stack<ListNode> stack = new Stack<>();
        for(ListNode n = l; n!=null; n=n.next, c+=k)
            stack.push(n);
        return stack;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = makeStack(l1,  1);
        Stack<ListNode> stack2 = makeStack(l2, -1);
        if(c<0){ // swapping if l1 is smaller than l2 in length
            ListNode t=l1; l1=l2; l2=t;
            Stack<ListNode> tt= stack1; stack1=stack2; stack2=tt;
        }
        int carry=0;
        while(!stack1.isEmpty()){
            int a=stack1.peek().val, b=(!stack2.isEmpty())? stack2.pop().val: 0;
            stack1.pop().val = (a+b+carry)%10;
            carry=(a+b+carry)/10;
        }
        if(carry==1) return new ListNode(1, l1);
        return l1;
    }
}
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         Stack <Integer> list1 = new Stack();
//         Stack <Integer> list2 = new Stack();
//         Stack <Integer> res = new Stack();
        
//         while(l1 != null){
//             list1.push(l1.val);
//             l1 = l1.next;
//         }
//         while(l2 != null){
//             list2.push(l2.val);
//             l2 = l2.next;
//         }
//         int carry = 0;
//         res.push(carry);
//         while(!list1.isEmpty() || !list2.isEmpty()){
//             int add1;
//             int add2;
            
//             if(!list1.isEmpty()){
//                 add1 = list1.pop();
//             }else{
//                 add1 = 0;
//             }
//             if(!list2.isEmpty()){
//                 add2 = list2.pop();
//             }else{
//                 add2 = 0;
//             }
//             res.pop();
//             int digit = carry + ((add1+add2)%10);
//             res.push(digit);
//             carry = (carry+add1+add2)/10;
//             res.push(carry);
//         }
        
//         ListNode ret = new ListNode(0);
//         ListNode send = ret;
//         if(res.peek() == 0){
//             res.pop();
//         }
//         if(res.peek() == 10){
//             res.pop();
//             res.push(0);
//             res.push(1);
//         }
//         while(!res.isEmpty()){
//             ret.next = new ListNode(res.pop());
//             ret = ret.next;
//         }
        
//         return send.next;
        
//     }
    

// }