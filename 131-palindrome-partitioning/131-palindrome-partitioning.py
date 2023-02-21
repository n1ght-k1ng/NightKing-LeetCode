# class Solution:
#     def palinpermute(self,prefix,suffix,l):
#         # if len(suffix) ==0:
#         if prefix == prefix[::-1]:
#             l.append([ele for ele in prefix])
    
#         for i in range(len(suffix)):
#             self.palinpermute(prefix+suffix[i],suffix[:i]+suffix[i+1:],l)
            
    
#     def partition(self, s: str) -> List[List[str]]:
#         l = [[]]
#         self.palinpermute("",s,l)
#         return l 
class Solution:
    def partition(self, s: str) -> List[List[str]]:
        palindro = []
        path = []
        self.helper(0, s, path, palindro)
        return palindro

    def helper(self, index, s, path, palindro):
        if index == len(s):
            palindro.append(path[:])
            return
        for i in range(index, len(s)):
            if self.is_palindro(s, index, i):
                path.append(s[index:i+1])
                self.helper(i+1, s, path, palindro)
                path.pop()

    def is_palindro(self, s, start, end):
        while start <= end:
            if s[start] != s[end]:
                return False
            start += 1
            end -= 1
        return True

        