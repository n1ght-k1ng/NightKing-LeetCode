# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        sum1 = ""
        sum2 = ""
        while l1:
            d = l1.val
            sum1 = sum1 + str(d)
            l1= l1.next
        while l2:
            sum2 = sum2 + str(l2.val)
            l2= l2.next
        sum1 = sum1[::-1]
        sum2 = sum2[::-1]
        sum1 = int(sum1)
        sum2 = int(sum2)
        print(sum1,sum2)
        sumf = sum1 + sum2
        sumf = str(sumf)
        print(sumf)
        
        new_list = ListNode(0)
        ans = new_list
        for i in range(len(sumf)-1,-1,-1):
            ans.next = ListNode(sumf[i])
            ans = ans.next
            
        
        return new_list.next
    
      
    
            