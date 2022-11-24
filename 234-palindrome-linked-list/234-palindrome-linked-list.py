# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        
        rev = None
        l1 = head
        while l1:
            rev = ListNode(l1.val, rev)
            l1 = l1.next
        while rev and head:
            if rev.val != head.val:
                return False
            rev = rev.next
            head = head.next
            
        return True
        
#         l1 = head
#         l = 0 
        
#         while l1:
#             l+=1
#             l1 = l1.next
#         L = (int)l
        
#         if l%2 == 0 :
#             l1 = head
#             arr1 = [0]*l//2
#             arr2 = [0]*l//2
#             for i in range(l//2):
#                 arr1[i] = l1.val
#                 l1=l1.next
#             for i in range(l//2):
#                 arr2[i] = l1.val
#                 l1= l1.next
#             if arr1 == arr2:
#                 return True
#             else:
#                 return False
#         else:
#             l1 = head
#             arr1 = [0]*l//2
#             arr2 = [0]*l//2
#             for i in range(l//2):
#                 arr1[i] = l1.val
#                 l1=l1.next
#             l1.next = l1.next.next
#             for i in range(l//2):
#                 arr2[i] = l1.val
#                 l1= l1.next
#             if arr1 == arr2:
#                 return True
#             else:
#                 return False
            