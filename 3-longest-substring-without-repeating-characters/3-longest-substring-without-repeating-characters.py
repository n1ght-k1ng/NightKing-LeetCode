class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
#         i=0
#         j=1 
#         if len(s) == 1:
#             return 1
#         l = 0 
#         d = {}
#         maxi = 0
#         while(i<j):
#             d[s[i]] = i
#             if(s[j] in d):
#                 d.clear()
#                 maxi = max(maxi,j-i)
#                 i+=1
#                 j+=1
#             else:
#                 d[s[j]] = i 
#                 j+=1
                
#         return maxi


#         d = set()
#         l,r =0,0
#         max1 = 0 
#         for r in range(len(s)):
#             if(s[r] in d != list(d)[-1]):
#                 while(l<r and s[r] != list(d)[-1]):
#                     d.remove(s[l])
#                     l+=1
#             d.add(s[r])
                
#             max1 = max(max1,r-l+1)
            
            
                
                    
                
                
#         return max1
                
        if len(s) < 2:
            return len(s)
        
        
        res = 0 
        i = 0
        for j in range(1,len(s)):
            
            if s[j] in s[i:j]:
                res = max(res,len(s[i:j]))
                while s[j] in s[i:j]:
                    i+=1
            elif j == len(s)-1:
                res = max(res,len(s[i:j +1]))
            
        return res
                
                
                
            
            
            
            
            
        
        