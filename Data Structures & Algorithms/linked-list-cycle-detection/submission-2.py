# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        s_p = head
        f_p = head
        while(f_p != None and f_p.next != None):
            f_p = f_p.next.next
            s_p = s_p.next
            if(f_p == s_p):
                return True
        return False
