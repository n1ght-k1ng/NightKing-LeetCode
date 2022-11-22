# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        
        list3 = ListNode()
        newl = list3
        
        while list1 and list2:
            if(list1.val <= list2.val):
                newl.next = list1
                list1 = list1.next
                newl = newl.next
            else:
                newl.next = list2
                list2 = list2.next
                newl = newl.next
        if list1:
            newl.next= list1
        if list2:
            newl.next= list2
            
        return list3.next
        # list3=ListNode()
        # temp1,temp2,temp=list1,list2,list3
        # while temp1 and temp2:
        #     if temp1.val<=temp2.val:
        #         temp.next=temp1
        #         temp1=temp1.next
        #     else:
        #         temp.next=temp2
        #         temp2=temp2.next
        #     temp=temp.next
        # if temp1:
        #     temp.next=temp1
        # if temp2:
        #     temp.next=temp2
        # return list3.next
    
    # why do we make copies of Linkedlist
                
        