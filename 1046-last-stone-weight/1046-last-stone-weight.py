
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:

        # Iterate over stones, until none left. 
        while len(stones) > 1:

            # Get max stone, and remove it from stones. 
            y = stones.pop(stones.index(max(stones)))

            # Get second to max stone and remove it from stones. 
            x = stones.pop(stones.index(max(stones)))

            # If the stones weights are the same, remove both.

            # If the stone weights are different, replace with the difference. 
            if x != y:
                stones.append(y - x)
        
        # If there are no stones left, return 0, (special case). 
        if len(stones) == 0:
            return 0
        
        # Otherwise, return the last remaining stone in stones. 
        else:
            return stones[0]