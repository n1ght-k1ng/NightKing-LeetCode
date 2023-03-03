class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        j = 0
        st = ""
        if len(haystack) == 1:
            return 0 
        get = -1
        count = len(needle)
        i =0 
        j= i + len(needle)
        while j <= len(haystack):
            print(haystack[i:j])
            if haystack[i:j] == needle:
                get = i
                break
            i +=1
            j +=1
        
        return get
        
            
            