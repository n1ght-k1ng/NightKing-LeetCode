# class Solution:
#     def nextGreatestLetter(self, letters: List[str], target: str) -> str:
#         st = 0 
#         end = len(letters) -1 
#         while(st<end):
            
#             mid = st + ((end-st)//2)
#             if target >= letters[int(mid)]:
                
#                 st = mid +1 
#             else :
#                 end = mid 
           
#         return letters[st%len(letters)]
    
class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        l=0
        r=len(letters)
        while l<r:
            mid=(int)(l+(r-l)/2)
            if letters[mid]<=target:
                l=mid+1
            else:
                r=mid
        return letters[l%len(letters)]