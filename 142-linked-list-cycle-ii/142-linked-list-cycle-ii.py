# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        try:
            slow = head.next
            fast = head.next.next
            
            while slow is not fast:
                slow = slow.next
                fast = fast.next.next
                
            rtn = head 
            while rtn is not slow:
                rtn = rtn.next
                slow = slow.next
            return rtn
        except:
            return None

#     def detectCycle(self, head):
#         try:
#             slow = head.next
#             fast = head.next.next
#             while slow is not fast:
#                 slow = slow.next
#                 fast = fast.next.next
#             rtn = head
#             while rtn is not slow:
#                 rtn = rtn.next
#                 slow = slow.next
#             return rtn

#         except:
#             return None

        