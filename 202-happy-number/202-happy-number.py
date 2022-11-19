
class Solution:
    def isHappy(self, n: int) -> bool:
        num_set = set()
        while n != 1:
            n = sum([int(d) ** 2 for d in str(n)])
            if n in num_set:
                return False
            else:
                num_set.add(n)
        return True

        
        
        
        