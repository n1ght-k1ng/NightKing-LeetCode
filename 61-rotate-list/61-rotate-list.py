# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        
        if not head or not k:
            return head
        l1 = head
        c1 = head
        new = ListNode()
        head = new
        c = 0
        while c1:
            c+=1
            c1=c1.next
        k = k%c if k>=c else k
        arr = [0]*c
        c = 0
        for i in range(len(arr)):
            arr[i] = l1.val
            l1=l1.next
            if l1 == None:
                break
        print(arr)
        for i in range(-k,len(arr)-k):
            new.next = ListNode(arr[i])
            new = new.next
            
        return head.next
    
#             current = ListNode()
#         head = current
        
#         for i in range(n - k, n):
#             node = ListNode(temp[i])
#             current.next = node
#             current = current.next
    